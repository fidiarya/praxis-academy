import java.util.Scanner;
public class Kondisi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10; 
        System.out.println("apakah angka anda lebih besar dari angka saya ?? ");
        System.out.print("Masukkan angkanya = ");
        int b = Integer.parseInt(scanner.nextLine()); 
        if (b > a) {
            System.out.println("Aangka anda lebih besar");
        } else {
            System.out.println("angka anda lebih kecil");
        }
    }
}