import java.util.Stack;
public class Main {
   
    public static void main(String[]args){
        Stack<String> stack = new Stack<String>();

        stack.push("ayam");
        stack.push("Bebek");
        stack.push("haji udin");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //menampilkan isi stack
        System.out.println("isi stack:"+stack);
        //melihat data paling atas
        System.out.println("data paling atas:"+stack.peek());

        //menghapus teratas 
        System.out.println("pop:"+stack.pop());
        //isi stack setelah pop
        System.out.println("isi stack sekarang:"+stack);
    }
}
