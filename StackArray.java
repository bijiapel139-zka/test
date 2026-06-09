public class StackArray {
    int max=5;
    int stack[]=new int[max];
    int top=-1;
    //push
    void push(int data){
        if(top==max-1){
            System.out.println("stack overflow");
        }else{
            top++;
            stack[top]=data;
        }
    }
    //pop
    int pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return 0;
        }else{
            int data=stack[top];
            top--;
            return data;
        }
    }
    //peek
    int peek(){
        if(top==-1){
            System.out.println("stack underflow");
            return 0;
        }else{
            return stack[top];
        }
    }
    // display
    void display(){
        if(top==-1){
            System.out.println("stack underflow");
        }else{
            for(int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
    }
}
