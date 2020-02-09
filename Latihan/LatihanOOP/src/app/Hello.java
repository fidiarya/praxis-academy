package app;

/**
 * Hello
 */

// class template untuk konstruktor
class Coba {
    int no;
    String nama;
    int umur;
    String jenis;

    // contructor
    Coba(int no, String nama, int umur, String jenis) {
        this.no = no;
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }

    // method tanpa return dan tanpa parameter
    void Tampil() {
        System.out.println("No : " + no);
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Jenis : " + jenis);
        System.out.println("=============================");
    }

    // method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // method dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    // method dengan return dan dengan parameter
    String Hay(String pesan) {
        return pesan + "Nama saya adalah " + this.nama;
    }

    // method dengan

}

public class Hello {

    public static void main(String[] args) {
        Coba ob1 = new Coba(1, "boy", 23, "laki");
        System.out.println(ob1.nama);
        ob1.Tampil();
        ob1.setNama("anu");
        ob1.Tampil();

        System.out.println(ob1.getNama());

        String isi = ob1.Hay("ini pesan dari bos ");
        System.out.println(isi);

    }
}