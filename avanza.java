package praktikum1;

public class avanza extends mobil {
    public String type;
    public String jml_penumpang;

    public avanza(String merk, String nama, String ban, String warna, String type, String jml_penumpang){
        super(merk, nama, warna, ban);
        this.type = type;
        this.jml_penumpang = jml_penumpang;
    }

    public void cetakmobil(){
        System.out.println(" merek " + merk);
        System.out.println(" nama " + nama);
        System.out.println(" ban "+ ban);
        System.out.println(" warna "+warna);
        System.out.println(" type "+type);
        System.out.println(" jml penumpang "+jml_penumpang);
    }
}