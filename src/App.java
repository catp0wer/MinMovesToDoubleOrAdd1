import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        Moves move = new Moves();
        int result = move.minMoves(number);
        System.out.println("Minumum number of moves is : " + result);
    }
}