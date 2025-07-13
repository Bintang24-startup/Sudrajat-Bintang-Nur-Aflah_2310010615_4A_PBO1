# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `laptop5`, `laptopGaming`, dan `PenjualanLaptop` adalah contoh dari class.

```bash
public class laptop5 {
    ...
}

public class laptopGaming extends laptop5 {
    ...
}

public class PenjualanLaptop {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarLaptop[i] = new laptop5(merk, tipe, harga);` adalah contoh pembuatan object.

```bash
daftarLaptop[i] = new laptop5(merk, tipe, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk`,`tipe` dan `harga` adalah contoh atribut.

```bash
private String merk;
private String tipe;
private int harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `laptop5` dan `laptopGaming`.

```bash
public laptop5(String merk, String tipe, int harga) {
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
}

public LaptopGaming(String merk, String tipe, int harga, String gpu) {
        super(merk, tipe, harga);  // Memanggil constructor dari superclass (Laptop)
        this.gpu = gpu;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini,`setHarga` adalah contoh method mutator.

```bash
public void setHarga(int harga) {
        this.harga = harga;
    }

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getTipe`, dan `getHarga` adalah contoh method accessor.

```bash
public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getHarga() {
        return harga;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk`,`tipe`,dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private String tipe;
private int harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `laptopGaming` mewarisi `laptop5` dengan sintaks `extends`.

```bash
public class laptopGaming extends laptop5 {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
// 9. Polymorphism: Method tampilInfo dioverride untuk menampilkan GPU juga
    @Override
    public void tampilInfo() {
        super.tampilInfo(); // Memanggil method dari superclass
        System.out.println("GPU: " + gpu);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `daftarLaptop` dan seleksi `switch` dalam method `getProdi`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < daftarLaptop.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
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
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `laptop5[] daftarLaptop = new laptop5[3];` adalah contoh penggunaan array.

```bash
laptop5[] daftarLaptop = new laptop5[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
 } catch (Exception e) {
                // 14. Error Handling: Menangani input tidak valid
                System.out.println("Terjadi kesalahan input. Ulangi.");
                i--; // Kembali input ulang
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Sudrajat Bintang Nur Aflah
NPM: 2310010615
