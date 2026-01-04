import java.util.Scanner;

public class MainRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution sol = new QBasica1SecondLargest();
//        Solution sol = new Q4_sortZeroOneTwoDutchFlag();
        sol.solve(sc);
    }
}