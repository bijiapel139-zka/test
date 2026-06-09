package praktikum3;

public class Main {
    public static void main(String[] args) {
        Mylist<Integer> list = new Mylist<Integer>();
        list.add(10); // 1
        list.add(20); // 1 2
        list.add(30); // 1 2 3
        list.add(40); // 1 2 3 4
        list.add(50); // 1 2 3 4 5
        System.out.println(list.get(1)); // 3
        list.print(); // 1 2 3 4 5
    }
    
}
