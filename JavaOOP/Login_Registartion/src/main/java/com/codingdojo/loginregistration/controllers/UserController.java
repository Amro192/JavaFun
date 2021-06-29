package com.codingdojo.loginregistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.loginregistration.models.User;
import com.codingdojo.loginregistration.services.UserService;

@Controller
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/registration")
	public String registerForm(@ModelAttribute("user") User user) {
		return "registrationPage.jsp";
	}

	@RequestMapping("/login")
	public String login(HttpSession session) {
		if (session.isNew() || session.getAttribute("userId") == null) {
			return "loginPage.jsp";

		}
		if (session.getAttribute("userId") != null) {
			return "redirect:/home";
		}
		return "loginPage.jsp";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		// if result has errors, return the registration page (don't worry about
		// validations just now)
		if (result.hasErrors()) {
			return "registrationPage.jsp";
		}
		// else, save the user in the database, save the user id in session, and
		// redirect them to the /home route
		User u = userService.registerUser(user);
		session.setAttribute("userId", u.getId());
		return "redirect:/home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
			HttpSession session) {
		// if the user is authenticated, save their user id in session
		if (userService.authenticateUser(email, password)) {
			session.setAttribute("userId", userService.findByEmail(email).getId());
			return "redirect:/home";
		}
		// else, add error messages and return the login page
		model.addAttribute("error", "Invalid Credantials, Please try again");
		return "loginPage.jsp";
	}

	@RequestMapping("/home")
	public String home(HttpSession session, Model model) {
		// get user from session, save them in the model and return the home page
		if(session.getAttribute("userId")==null) {
			return "redirect:/login";
		}
		if (session.isNew()==false || session.getAttribute("userId") != null) {
			Long id = (Long) session.getAttribute("userId");
			User user = userService.findUserById(id);
			model.addAttribute("user", user);
			return "homePage.jsp";
		}
		return "redirect:/login";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		// invalidate session
		session.invalidate();
		// redirect to login page
		return "redirect:/login";
	}

}
