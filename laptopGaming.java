// 1. Class: Subclass LaptopGaming
// 8. Inheritance: LaptopGaming mewarisi Laptop
public class LaptopGaming extends laptop5 {
    private String gpu;  // 3. Atribut tambahan khusus gaming

    // 4. Constructor: Meneruskan atribut ke superclass dan isi tambahan
    public LaptopGaming(String merk, String tipe, int harga, String gpu) {
        super(merk, tipe, harga);  // Memanggil constructor dari superclass (Laptop)
        this.gpu = gpu;
    }

    // 9. Polymorphism: Method tampilInfo dioverride untuk menampilkan GPU juga
    @Override
    public void tampilInfo() {
        super.tampilInfo(); // Memanggil method dari superclass
        System.out.println("GPU: " + gpu);
    }
}