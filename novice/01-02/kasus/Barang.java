/**
 * Barang
 */
public class Barang {

    int[] id = { 01, 02, 03, 04 };
    String[] nama = { "sabun", "sampo", "beras", "telor" };
    String[] satuan = { "pcs", "lt", "kg" };
    int[] harga = { 2000, 12000, 7000, 20000 };

    void beliSabun() {
        id = id[0];
        nama = nama[0];
        satuan = satuan[0];
        harga = harga[0];
    }

    // System.out.println(beliSabun);
}