import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {

        int randomNum = (int) (Math.random() * 101);
        int guessNum;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the number (0-100):");
        guessNum = scanner.nextInt();

        while (guessNum != randomNum) {

            if (guessNum > randomNum) {
                System.out.println("Lower !");
                System.out.print("Guess the number :");
                guessNum = scanner.nextInt();

            } else if (guessNum < randomNum) {
                System.out.println("Higher !");
                System.out.print("Guess the number :");
                guessNum = scanner.nextInt();

            }
        }

        if (guessNum == randomNum) {
            System.out.println("Congrats ! The number was : " + randomNum);
        }

        scanner.close();
    }
}