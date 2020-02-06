package nomorSatu;

/**
 * overide Saat mengganti metode di kelas anak, kita harus menggunakan anotasi
 * ini untuk menandai metode itu.
 */
public class AnoOverride {

    public void metotInti() {
        System.out.println("ini yang lama");
    }

    public static void main(String[] args) {
        OverrideAnak coba1 = new OverrideAnak();
        coba1.metotInti();
    }
}

class OverrideAnak extends AnoOverride {

    @Override
    public void metotInti() {
        System.out.println("ini yang baru");
    }
}