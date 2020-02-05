/**
 * klas2
 */
class Klas2 {

    public static void main(String[] args) {

        Klas1 turun1 = new Klas1();
        Klas1 turun2 = new Klas1();

        turun1.ambilBuku(3);
        turun1.ambilPensil(4);
        turun1.jumlahkan();
        turun1.tampilkan();

        turun2.ambilBuku(15);
        turun2.ambilPensil(10);
        turun2.jumlahkan();
        turun2.tampilkan();
    }
}