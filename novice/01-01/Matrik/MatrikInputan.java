
/**
 * MatrikInputan
 */
import java.util.Scanner;

public class MatrikInputan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Matrik Inputan :");
        System.out.println("=============================");

        System.out.println("Matrik A");
        System.out.print("Masukkan Matrik A ke-1 = ");
        int a1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Matrik A ke-2 = ");
        int a2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Matrik A ke-3 = ");
        int a3 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Matrik A ke-4 = ");
        int a4 = Integer.parseInt(scanner.nextLine());

        System.out.println("Matrik B");
        System.out.print("Masukkan Matrik B ke-1 = ");
        int b1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Matrik B ke-2 = ");
        int b2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Matrik B ke-3 = ");
        int b3 = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Matrik B ke-4 = ");
        int b4 = Integer.parseInt(scanner.nextLine());

        int[][] matrikA = new int[][] { { a1, a2 }, { a3, a4 } };
        int[][] matrikB = new int[][] { { b1, b2 }, { b3, b4 } };

        System.out.println("Matrik A");
        System.out.println(matrikA);
        System.out.println("Matrik B");
        System.out.println(matrikB);

        System.out.println("Setelah di jumlahkan :");

        int jumlah[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                jumlah[i][j] = matrikA[i][j] + matrikB[i][j];
                System.out.print(jumlah[i][j] + " ");
            }
            System.out.println("");
        }
    }
}