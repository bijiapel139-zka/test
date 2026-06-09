package praktikum4;

/**
 * 1. Definisi Node (Definition of Node)
 * Ibarat satu gerbong kereta yang menyimpan data dan alamat gerbong selanjutnya. (Like a train car that holds data and the address of the next car)
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null; // Awalnya tidak menunjuk ke mana pun (first pointing to nothing)
    }
}

/**
 * 2. Implementasi Singly Linked List (Implementation of Singly Linked List)
 */
public class SingleLinkedList {
    Node head; // Pintu masuk utama ke list (Entrance gate to the main list)

    // Cek apakah list masih kosong (check if the list is empty)
    public boolean isEmpty() {
        return head == null;
    }

    // Menambah data di posisi paling depan (Paling efisien - O(1)) add data at the beginning (the most efficient - O(1))
    public void tambahDepan(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Sambungkan node baru ke yang lama (connect new node to the old one)
        head = newNode;      // Geser head ke node yang baru (move head to the new node)
    }

    // Menambah data di posisi paling belakang (Butuh iterasi - O(n)) (add data at the end (need iteration - O(n)))
    public void tambahBelakang(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            // Berjalan sampai menemukan node terakhir (yang next-nya null) (run until you find the last node (whose next is null))
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // Sambungkan node terakhir ke node baru (connect the last node to the new node)
        }
    }

    // Menghapus data berdasarkan nilai (delete data based on value)
    public void hapus(int nilai) {
        if (isEmpty()) return;

        // Kasus jika data yang dihapus ada di Head (case if the data to be deleted is in the head)
        if (head.data == nilai) {
            head = head.next;
            return;
        }

        Node current = head;
        // Mencari node sebelum node yang akan dihapus (find the node before the node to be deleted)
        while (current.next != null && current.next.data != nilai) {
            current = current.next;
        }

        // Jika ketemu, "lompati" node tersebut ( if found, skip the node to be deleted)
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Menampilkan semua isi list (display all contents of the list)
    public void tampilkan() {
        Node temp = head;
        System.out.print("Isi List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.tambahBelakang(10);
        list.tambahBelakang(20);
        list.tambahDepan(5);      // List menjadi: 5 -> 10 -> 20 (the list becomes: 5 -> 10 -> 20)
        
        list.tampilkan();

        System.out.println("Menghapus angka 10...");
        list.hapus(10);
        
        list.tampilkan();         // Hasil akhir: 5 -> 20 -> null (final result: 5 -> 20 -> null)
    }
}
//tugassssssss!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!/ task!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! tulis dalam word dan kirim di link g drive (write in word and send to link g drive)
// 1. //Jalankan kode diatas, dan output apa yang keluar (explain what output comes out?)
// 2. jelaskan logika algoritma dari setiap method! (explain the logic of each method!)
// 3. jelaskan kodingan nomer 73-81(Explain the code in lines 73-81)
