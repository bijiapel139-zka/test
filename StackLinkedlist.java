public class StackLinkedlist {
    Node top;
    //push
    void push(int data){
        Node baru=new Node(data);
        baru.next=top;
        top=baru;
        System.out.println(data+" ditambahkan ke stack");

    }
    //pop
    void pop(){
        if(top==null){
            System.out.println("stack kosong");
        }else{
            System.out.println(top.data+" dihapus dari stack");
            top=top.next;
        }
    }
    //peek
    void peek(){
        if(top==null){
            System.out.println("stack kosong");
        }else{
            System.out.println("nilai paling atas stack adalah "+top.data);
        }
    }
    //display
    void display(){
        if(top==null){
            System.out.println("stack kosong");
        }else{
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
