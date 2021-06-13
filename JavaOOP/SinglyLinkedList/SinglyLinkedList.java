public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
        Node runner1 = head;
        while (runner1.next.next != null){
            runner1 = runner1.next;
            runner1.next = null;
        }
    }

    public void printValues(){
        Node runner2 = head;
        while(runner2.next != null){
            System.out.println(runner2);
        }
    }    
}