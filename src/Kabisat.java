import java.util.Scanner;

public class Kabisat {

    public static void main(String[] args) {

        while (true){
            System.out.println("Masukan Tahun : ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input < 1000){
                System.out.println("Masukan Tahun Yang Lebih Dari 999");
            }else {
                if (input % 400 == 0){
                    System.out.println("Ini Tahun Kabisat");
                }if (input % 400 != 0 && input % 100 == 0){
                    System.out.println("Bukan Tahun Kabisat");
                }if (input % 400 != 0 && input % 100 != 0 && input % 4 == 0){
                    System.out.println("Ini Tahun Kabisat");
                }if (input % 400 != 0 && input % 100 != 0 && input % 4 != 0){
                    System.out.println("Bukan Tahun Kabisat");
                }
            }
        }
    }
}
