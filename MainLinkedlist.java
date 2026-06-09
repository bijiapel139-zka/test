import java.util.Stack;

public class MainLinkedlist {
    public static void main(String[] args) {
        StackLinkedlist stack = new StackLinkedlist();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.display();
        stack.pop();
        stack.peek();
    }
    
}
