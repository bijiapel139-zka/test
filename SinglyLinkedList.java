package praktikum4;

class Node {
    int data; // Di buku menggunakan 'data' atau 'Data' (in the book using 'data' or 'Data')
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    // --- Method Penambahan Data --- (method for adding data)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // --- Method Sisip Sebelum Nilai Tertentu (Tugas No. 3) --- (insert before a certain value)
    public void insertBefore(int value, int data) {
        if (isEmpty()) return;

        // Jika data yang dicari ada di head (case if the searched data is in the head)
        if (head.data == value) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    // --- Method Penghapusan --- (method for deletion)
    public void remFirst() {
        if (!isEmpty()) {
            if (head == tail) head = tail = null;
            else head = head.next;
        }
    }

    // --- Method Cetak ---(method for printing)
    public void printList() {
        if (isEmpty()) {
            System.out.println("List masih kosong");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // --- Method Main untuk Menjalankan ---(method for running)
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Sesuai ilustrasi di buku (No. 3)
        list.addLast(11);
        list.addLast(22);
        list.addLast(33);
        list.addLast(44);
        list.addLast(55);
        list.addLast(66);
        list.addLast(77);

        System.out.print("List awal : ");
        list.printList();

        System.out.println("Data baru = 100, Value = 44");
        list.insertBefore(44, 100);

        System.out.print("List hasil: ");
        list.printList();
    }
}

//tugassssssss!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!/ task!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! tulis dalam word dan kirim di link g drive (write in word and send to link g drive)
// 1. output apa yang keluar?(what output comes out?)
// 2. apakah ada perbedaan antara penambahan data di depan dan penambahan data di belakang?(Is there a difference between adding data in front and adding data in back?)
// 3. jelaskan maksud statement dari this.data=data?(Explain the meaning of the statement this.data=data?)