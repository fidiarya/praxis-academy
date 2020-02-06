package nomorSatu;

/**
 * Anotasi SuppressWarnings adalaha anotasi yang di gunakan untuk
 * menginformasikan bahwa method lama di gunakan lagi agar memerintahkan
 * kompiler menampilkan peringatan khusus
 */
public class AnoSuppressWarnings {

    public static void main(String[] args) {
        Lama obj1 = new Lama();
        obj1.metotInti();
    }
}

class Lama {

    @SuppressWarnings("deprecated")
    @Deprecated
    public void metotInti() {
        System.out.println("ini yang lama");
    }
}

class Baru {
    public void metotInti() {
        System.out.println("ini yang baru");
    }
}