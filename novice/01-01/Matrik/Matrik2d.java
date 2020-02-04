/**
 * Matrik2d
 */
public class Matrik2d {

    public static void main(String[] args) {
        int[][] matrikA = new int[][] { { 2, 3 }, { 4, 5 } };
        int[][] matrikB = new int[][] { { 3, 6 }, { 2, 4 } };

        int jumlah[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                jumlah[i][j] = matrikA[i][j] + matrikB[i][j];
                System.out.println(jumlah[i][j] + " ");
            }
            System.out.println("");
        }
    }
}