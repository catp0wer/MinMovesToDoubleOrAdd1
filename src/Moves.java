public class Moves {

    int count = 0;

    public int minMoves(int number) {
        while (number > 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number -= 1;
            }
            count++;
            System.out.println(number);
        }
        return count;

    }
}