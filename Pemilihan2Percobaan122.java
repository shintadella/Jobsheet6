import java.util.Scanner;

public class Pemilihan2Percobaan122 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int tahun;

        System.out.print("Masukkan Tahun: ");
        tahun = input.nextInt();

        if ((tahun % 4) == 0 ) {
            if (( tahun % 100) != 0)
                System.out.println( "Tahun Kabisat");
            else{
                System.out.println("bukan tahun kabisat");
            }

            }else{
                System.out.println("Bukan tahun kabisat");
        }
        }
    
}
