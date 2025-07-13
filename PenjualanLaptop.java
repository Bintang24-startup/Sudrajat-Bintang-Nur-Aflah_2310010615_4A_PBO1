import java.util.Scanner; // 12. IO Sederhana
                          // Digunakan untuk input dari keyboard

public class PenjualanLaptop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 13. Array: Menyimpan beberapa objek laptop
        laptop5[] daftarLaptop = new laptop5[3];

        System.out.println("=== Input Data Laptop ===");

        // 11. Perulangan: Digunakan untuk input data laptop sebanyak 3 kali
        for (int i = 0; i < daftarLaptop.length; i++) {
            try {
                System.out.println("\nData Laptop ke-" + (i + 1));

                // 12. IO Sederhana: Input dari pengguna
                System.out.print("Masukkan jenis (1. Biasa / 2. Gaming): ");
                int jenis = Integer.parseInt(input.nextLine());

                System.out.print("Merk: ");
                String merk = input.nextLine();

                System.out.print("Tipe: ");
                String tipe = input.nextLine();

                System.out.print("Harga: ");
                int harga = Integer.parseInt(input.nextLine());

                // 2. Object: Membuat objek dari class Laptop atau LaptopGaming
                // 10. Seleksi: Menggunakan if-else untuk memilih jenis laptop
                if (jenis == 1) {
                    daftarLaptop[i] = new laptop5(merk, tipe, harga);
                } else if (jenis == 2) {
                    System.out.print("GPU: ");
                    String gpu = input.nextLine();
                    daftarLaptop[i] = new LaptopGaming(merk, tipe, harga, gpu);
                } else {
                    System.out.println("Pilihan tidak valid.");
                    i--; // Ulangi input
                }
            } catch (Exception e) {
                // 14. Error Handling: Menangani input tidak valid
                System.out.println("Terjadi kesalahan input. Ulangi.");
                i--; // Kembali input ulang
            }
        }

        System.out.println("\n=== Daftar Laptop ===");

        // 11. Perulangan & 9. Polymorphism: Menampilkan semua laptop
        for (laptop5 laptop : daftarLaptop) {
            laptop.tampilInfo(); // Polymorphic method
            System.out.println("-------------------");
        }

        System.out.println("\n=== Laptop dengan harga > 10 juta ===");

        // 10. Seleksi + 11. Perulangan
        for (laptop5 laptop : daftarLaptop) {
            if (laptop.getHarga() > 10000000) {
                System.out.println(
                    laptop.getMerk() + " " + laptop.getTipe() + " - Rp " + laptop.getHarga()
                );
            }
        }

        input.close();
    }
}
