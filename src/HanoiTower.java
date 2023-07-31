import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRings;
        while(true) {
            try {
                System.out.println("How many rings?");
                numRings = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Please enter a positive integer");
            }
        }
        solveHanoi("A", "B", "C", numRings);

    }

    public static void solveHanoi(String first, String middle, String last, int n) {
        if (n == 0) {
            return;
        }
        solveHanoi(first, last, middle, n-1);
        System.out.println("Move disk " + n + " from " + first + " to " + last);
        solveHanoi(middle, last, first, n-1);
    }
}
