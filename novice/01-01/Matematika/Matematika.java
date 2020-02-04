/**
 * Matematika
 */
public class Matematika {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        int tambah = a + b;
        int kurang = a - b;
        int kali = a * b;
        int bagi = a / b;
        int modulus = a % b;

        System.out.println("===========================");
        System.out.println("Matematika");
        System.out.println("===========================");
        System.out.println("penjumlahan " + a + "+" + b + "=" + tambah);
        System.out.println("pengurangan " + a + "-" + b + "=" + kurang);
        System.out.println("perkalian " + a + "x" + b + "=" + kali);
        System.out.println("pembagian " + a + ":" + b + "=" + bagi);
        System.out.println("sisa bagi " + a + "%" + b + "=" + modulus);
    }
}