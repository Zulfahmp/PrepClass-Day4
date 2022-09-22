import java.util.Scanner;

public class GanjilGenap {

    public static void main(String[] args) {

        while (true){
            System.out.print("Input : ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input % 2 == 0){
                System.out.println("Ini Genap");
            }if (input % 2 != 0){
                System.out.println("Ini Ganjil");
            }
        }
    }
}
