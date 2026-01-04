import java.util.Scanner;

public class QBasicRemoveDuplicates implements Solution {
    @Override
    public void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int correctPlace = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[correctPlace] = arr[i];
                correctPlace++;
            }
        }

        System.out.println("The correct answer is " + correctPlace);
    }
}
