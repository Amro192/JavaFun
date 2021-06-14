
public class CalculatorC {
	 public double setOperandOne;
	 public String setOperation;
	 public double setOperandTwo;
	 public double result=0.0;
	 public  CalculatorC() {}
	 
	 public void setOperandOne(double num1) {
		 this.setOperandOne=num1;
	 }
	 public void setOperandTwo(double num2) {
		 this.setOperandTwo=num2;
	 }
	 public void setOperation(String op) {
		 this.setOperation=op;
	 }
	 public void performOperation(){

		 if(this.setOperation == "+") {
			 this.result= this.setOperandOne + this.setOperandTwo;
		 }
		 else if(this.setOperation == "-") {
			 this.result= this.setOperandOne - this.setOperandTwo;
		 }
		 else if(this.setOperation == "/") {
			 this.result= this.setOperandOne / this.setOperandTwo;
		 }
		 else if(this.setOperation == "*") {
			 this.result= this.setOperandOne * this.setOperandTwo;
		 }
	 }
	 
	 public void getResults() {
		 System.out.println(this.result);
	 }
}
