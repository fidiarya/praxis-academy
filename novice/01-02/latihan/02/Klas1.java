/**
 * klas1
 */
class Klas1 {

    int buku = 0;
    int pensil = 0;
    int total = 0;

    void ambilBuku(int NewValue) {
        buku = NewValue;
    }

    void ambilPensil(int NewValue) {
        pensil = NewValue;
    }

    void jumlahkan () {
        total = pensil + buku;
    }

    void tampilkan () {
        System.out.println(" buku = " + buku + "\n pensil = " + pensil + "\n total = " + total);
    }
}