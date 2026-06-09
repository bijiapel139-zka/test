package praktikum1;

public class mobil {
    public String merk;
    public String nama;
    public String ban;
    public String warna;

    public mobil(String merk, String nama, String ban, String warna){
        this.merk = merk;
        this.nama = nama;
        this.ban = ban;
        this.warna = warna;
    }
    
    public void tampilkaninfo(){
        System.out.println(" merek " + merk);
        System.out.println(" nama " + nama);
        System.out.println(" ban "+ ban);
        System.out.println(" warna "+warna);
    }
}
