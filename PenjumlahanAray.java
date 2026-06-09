package praktikum2;

public class PenjumlahanAray {
public static void main(String[] args) {
    int []A= {10,20,30};
    int []B= {40,50,60};
    int [] tambah = new int[A.length];
    int [] kurang = new int [A.length];
    for (int i = 0; i < A.length; i++) {
        tambah[i] = A[i] + B[i];
        kurang[i] = A[i] - B[i];
    }
    System.out.println("hasil penjumlahan array a + array b");
    for(int i = 0; i < A.length; i++) {
        System.out.println(tambah[i]);
    }
    System.out.println("hasil pengurangan array a - array b");
    for(int i = 0; i < A.length; i++) {
        System.out.println(kurang[i]);
    }

    }
}

