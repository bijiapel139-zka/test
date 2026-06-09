import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
        System.out.println("Barang berhasil ditambahkan.");
    }

    public void tampilkanBarang() {
        if (daftarBarang.isEmpty()) {
            System.out.println("Gudang kosong.");
            return;
        }
        for (Barang b : daftarBarang) {
            System.out.println(b);
        }
    }

    public void cariBarang(String keyword) {
        boolean ditemukan = false;
        for (Barang b : daftarBarang) {
            if (b.getKode().equalsIgnoreCase(keyword) || b.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(b);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public void hapusBarang(String kode) {
        Barang target = null;
        for (Barang b : daftarBarang) {
            if (b.getKode().equalsIgnoreCase(kode)) {
                target = b;
                break;
            }
        }
        if (target != null) {
            daftarBarang.remove(target);
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public void updateBarang(String kode, String nama, Integer jumlah, String lokasi) {
        for (Barang b : daftarBarang) {
            if (b.getKode().equalsIgnoreCase(kode)) {
                if (nama != null && !nama.isEmpty()) b.setNama(nama);
                if (jumlah != null) b.setJumlah(jumlah);
                if (lokasi != null && !lokasi.isEmpty()) b.setLokasi(lokasi);
                System.out.println("Barang berhasil diupdate.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }
}
