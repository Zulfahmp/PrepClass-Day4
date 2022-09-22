import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        while (true){
            System.out.println("Masukan Nilai Input : ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input >= 100){
                System.out.println("Input yang anda masukan lebih dari 100");
            }else {
                if (input >= 90){
                    System.out.println("Output : A");
                }if (input >= 80 && input <= 89){
                    System.out.println("Output : B");
                }if (input >= 70 && input <= 79){
                    System.out.println("Output : C");
                }if (input >= 60 && input <= 69){
                    System.out.println("Output : D");
                }if (input <= 59){
                    System.out.println("Output : E");
                }
            }
        }
    }
}
