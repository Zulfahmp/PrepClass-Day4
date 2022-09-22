import java.util.Scanner;

public class FilmRating {

    public static void main(String[] args) {

        while (true){
            System.out.print("Masukan Usia Anda : ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input >= 21){
                System.out.println("Dewasa");
            }else if (input >= 13){
                System.out.println("Remaja");
            }else if (input >= 9){
                System.out.println("Bimbingan Orang Tua");
            }else if (input < 9){
                System.out.println("Semua Usia");
            }
        }
    }
}
