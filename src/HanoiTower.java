import java.util.Scanner;

public class HanoiTower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRings;
        while(true) {
            try {
                // get number of disks
                System.out.println("How many disks?");
                numRings = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("Please enter a positive integer");
            }
        }
        solveHanoi("A", "B", "C", numRings); // move disks from A to C using B

    }

    public static void solveHanoi(String first, String middle, String last, int n) {
        if (n == 0) { // terminate when all disks hae been moved from first to last
            return;
        }
        solveHanoi(first, last, middle, n-1); // move disk n-1 from first to middle
        System.out.println("Move disk " + n + " from " + first + " to " + last); // move disk n from first to last
        solveHanoi(middle, first, last, n-1); // move disk n-1 from middle to last
    }
}
