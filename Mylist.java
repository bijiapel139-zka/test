package praktikum3;

public class Mylist <T> {
    private Node<T> head;

    public void add(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public T get(int index){
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
   public void print() {
    Node<T> current = head;
    while (current != null) {
        System.out.println(current.data);
        current = current.next; // Pindahkan ke SINI (di dalam kurung kurawal)
      }
    }
}
