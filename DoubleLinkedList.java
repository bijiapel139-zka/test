package praktikum4;

/**
 * 1. Definisi Node untuk Double Linked List (dfinition of node for double linked list)
 * Memiliki dua penunjuk: next (ke depan) dan prev (ke belakang). have two pointers: next (forward) and prev (backward).
 */
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

/**
 * 2. Implementasi Double Linked List (implementation of double linked list)
 */
public class DoubleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    // Menambah di depan - O(1) (add first 0(1))
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode; // Hubungkan node lama ke node baru (connect node old to node new)
            head = newNode;
        }
    }

    // Menambah di belakang - O(1) karena menggunakan tail (add last 0(1) because using tail)
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail; // Hubungkan node baru ke node lama (connect node new to node old)
            tail = newNode;
        }
    }

    // Menampilkan list dari depan ke belakang (show list from front to back)
    public void displayForward() {
        System.out.print("Maju: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " <-> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    // Menampilkan list dari belakang ke depan (Membuktikan prev berfungsi) (show list from back to front) (check if prev works)
    public void displayBackward() {
        System.out.print("Mundur: ");
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + (temp.prev != null ? " <-> " : ""));
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.addLast(10);
        dll.addLast(20);
        dll.addFirst(5); // List: 5 <-> 10 <-> 20

        dll.displayForward();
        dll.displayBackward();
    }
}
//task :) tulis dalam word dan kirim di link g drive (write in word and send to link g drive)
//1. jelaskan secara singkat output yang kamu dapatkan diatas! (Explain what output you get!)
//2. jelaskan logika algoritma dari setiap method! (explain the logic of each method!)
//3. jelaskan fungsi node dalam double linked list! (explain the function of node in double linked list!)
