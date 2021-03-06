package nomorSatu;

import java.lang.annotation.Documented;

/**
 * Anotasi Interface ialah anotasi yang di gunakan untuk mendokumentasikan anotasi
 */

@Documented
@interface mobil {
    String warna();

    int tahun();

    int jumlah();

    String[] model();
}

@mobil(warna = "merah", tahun = 2010, jumlah = 2, model = { "bak", "sedan", "bus" })

public class AnoInterface {

    public static void main(String[] args) {
        System.out.println("tes anotasi interface");
    }
}