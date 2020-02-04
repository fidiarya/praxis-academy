import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        String[] hari = new String[] { "1. senin", "2. selasa", "3. rabu", "4. kamis", "5. jumat", "6. sabtu",
                "7. minggu" };
        for (int i = 0; i < hari.length; i++) {
            System.out.println(hari[i]);
        }

        System.out.println("silahkan masukkan pilihan anda : ");
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        switch (day) {
        case 1:
            System.out.println("anda memilih senin");
            break;
        case 2:
            System.out.println("anda memilih selasa");
            break;
        case 3:
            System.out.println("anda memilih rabu");
            break;
        case 4:
            System.out.println("anda memilih kamis");
            break;
        case 5:
            System.out.println("anda memilih jumat");
            break;
        case 6:
            System.out.println("anda memilih sabtu");
            break;
        case 7:
            System.out.println("anda memilih minggu");
            break;

        default:
            System.out.println("maaf pilihan anda tidak ada!");
            break;
        }

    }
}