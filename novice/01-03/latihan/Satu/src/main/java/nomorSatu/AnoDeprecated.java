package nomorSatu;

/**
 * Deprecated adalah anotasi unruk mendokumentasi bahwa method itu lawas / lama
 * yang tidak di gunakan lagi
 */
public class AnoDeprecated {

    @Deprecated
    public void metotInti() {
        System.out.println("ini yang lawas");
    }

    public static void main(String[] args) {
        DeprecatedAnak coba1 = new DeprecatedAnak();
        coba1.metotInti();
    }
}

class DeprecatedAnak {
    public void metotInti() {
        System.out.println("ini yang baru");
    }
}