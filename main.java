package praktikum1;

public class main {
    public static void main(String[] args) {
        mobil mobil1 = new mobil("tyota", "avanza", "4", "hitam");
        avanza avanza1 = new avanza("toyota", "avanza", "4", "hitam", "sedan", "5");

        mobil1.tampilkaninfo();
        avanza1.cetakmobil();
    }
} 
