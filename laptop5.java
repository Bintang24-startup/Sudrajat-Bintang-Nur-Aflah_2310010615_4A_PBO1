// 1. Class: Mendefinisikan class Laptop
public class laptop5 {
    // 3. Atribut: Dideklarasikan sebagai private untuk encapsulation
    private String merk;
    private String tipe;
    private int harga;

    // 4. Constructor: Mengisi atribut saat objek dibuat
    public Laptop(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }

    // 6. Accessor (Getter): Mengambil data atribut (enkapsulasi)
    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getHarga() {
        return harga;
    }

    // 5. Mutator (Setter): Mengubah nilai atribut harga (enkapsulasi)
    public void setHarga(int harga) {
        this.harga = harga;
    }

    // 9. Polymorphism: Method ini akan dioverride oleh subclass
    public void tampilInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Harga: " + harga);
    }
}
