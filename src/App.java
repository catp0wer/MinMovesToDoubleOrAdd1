import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

       // int number=200;
        int count = 0;

        while(number>1){
            if(number%2 ==0){
                number/=2;
            } else{
                number-=1;
            }
            count++;
            System.out.println(number);
        }
        System.out.println("Minumum number of moves is : " +count);
    }
}