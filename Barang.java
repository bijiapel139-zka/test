public class Barang{
    private String kode;
    private String nama;
    private int jumlah;
    private String lokasi;

    public Barang(String kode, String nama, int jumlah, String lokasi){
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
        this.lokasi = lokasi;
    }

    public String getKode(){
        return this.kode;
    }

    public String getNama(){
        return this.nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public int getJumlah(){
        return this.jumlah;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public String getLokasi(){
        return this.lokasi;
    }
    public void setLokasi(String lokasi){
        this.lokasi = lokasi;
    }

    @Override
    public String toString(){
        return"["+kode+"]"+nama+"-jumlah:"+jumlah+"-lokasi:"+lokasi;
    }

}