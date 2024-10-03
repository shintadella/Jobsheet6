import java.util.Scanner;

public class Pemilihan2Percobaan122 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int tahun;

        System.out.print("Masukkan Tahun: ");
        tahun = input.nextInt();

        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            System.out.println( tahun + " adalah tahun kabisat");
        } else {
                System.out.println("Bukan tahun kabisat");
        }
    }
    
}
