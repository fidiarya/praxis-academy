package latihan;

/**
 * java generic
 */
public class Dua {

    public static void main(String[] args) {
        // mendefinisikan nilai tipe data Integer
        Nilai<Integer> nilaiInteger = new Nilai<>();
        nilaiInteger.setNilai(123);
        System.out.println("Integer : " + nilaiInteger.getNilai());

        // mendefinisikan nilai tipe data string
        Nilai<String> nilaiString = new Nilai<>();
        nilaiString.setNilai("Contoh nilainya");
        System.out.println("String : " + nilaiString.getNilai());

        // mendefinisikan nilai tipe data boolean
        Nilai<Boolean> nilaiBoolean = new Nilai<>();
        nilaiBoolean.setNilai(true);
        System.out.println("Boolean : " + nilaiBoolean.getNilai());
    }
}