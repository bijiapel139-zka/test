import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gudang gudang = new Gudang();
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.println("\n--- MENU MANAJEMEN GUDANG ---");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Cari Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Update Barang");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Kode: ");
                    String kode = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Jumlah: ");
                    int jumlah = Integer.parseInt(scanner.nextLine());
                    System.out.print("Lokasi: ");
                    String lokasi = scanner.nextLine();
                    gudang.tambahBarang(new Barang(kode, nama, jumlah, lokasi));
                    break;

                case "2":
                    gudang.tampilkanBarang();
                    break;

                case "3":
                    System.out.print("Masukkan kode/nama: ");
                    String keyword = scanner.nextLine();
                    gudang.cariBarang(keyword);
                    break;

                case "4":
                    System.out.print("Masukkan kode barang yang ingin dihapus: ");
                    String kodeHapus = scanner.nextLine();
                    gudang.hapusBarang(kodeHapus);
                    break;

                case "5":
                    System.out.print("Kode barang yang ingin diupdate: ");
                    String kodeUpdate = scanner.nextLine();
                    System.out.print("Nama baru (kosong jika tidak diubah): ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Jumlah baru (kosong jika tidak diubah): ");
                    String jumlahStr = scanner.nextLine();
                    System.out.print("Lokasi baru (kosong jika tidak diubah): ");
                    String lokasiBaru = scanner.nextLine();

                    Integer jumlahBaru = jumlahStr.isEmpty() ? null : Integer.parseInt(jumlahStr);
                    gudang.updateBarang(kodeUpdate, namaBaru, jumlahBaru, lokasiBaru);
                    break;

                case "6":
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (!pilihan.equals("6"));

        scanner.close();
    }
}
