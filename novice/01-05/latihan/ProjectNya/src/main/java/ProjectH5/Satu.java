package ProjectH5;

import java.io.Serializable;
import java.io.*;
import java.util.Scanner;

/**
 * Satu
 */

class Serial implements Serializable {
    private String nama;
    private int umur;
    private transient int id;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class Deserial {

}

// kelas utama
public class Satu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan pilahan anda : \n" + "1. Simpan data \n " + "2. Tampilkan data");

        int pilih = scanner.nextInt();
        switch (pilih) {
        case 1:
            Simpan();
            break;
        case 2:
            Tampil();
            break;

        default:
            System.out.println("Maaf pilihan tidak ada!");
            break;
        }

    }

    public static void Simpan() {
        Serial person = new Serial();
        person.setId(10);
        person.setNama("Budi");
        person.setUmur(30);

        String lokasi = "D:\\Bootcamp\\praxis-academy\\novice\\01-05\\latihan\\person.txt";

        try (FileOutputStream file = new FileOutputStream(lokasi)) {

            // mengkonversi ke byte stream
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(person);
            output.close();

            System.out.println("data berhasil di simpan");
        } catch (IOException e) {
            System.out.println("data gaga di simpan");
        }
    }

    public static void Tampil() {
        String lokasi = "D:\\Bootcamp\\praxis-academy\\novice\\01-05\\latihan\\person.txt";

        try (FileInputStream fileInput = new FileInputStream(lokasi)) {
            // mengubah byte stream ke object kembali
            ObjectInputStream input = new ObjectInputStream(fileInput);

            // melakukan proses downcasting objek
            Serial person = (Serial) input.readObject();
            input.close();

            // tampilkan output hasilnya
            System.out.println(person.getId());
            System.out.println(person.getNama());
            System.out.println(person.getUmur());

        } catch (IOException e) {
            System.out.println("data gagal di tampilkan");
        }
    }
}