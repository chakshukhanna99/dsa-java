import java.util.ArrayList;
import java.util.Scanner;
//[1, 2, 3, 4, 5, 6, 7], k = 2,
public class QBasicRotateByD implements Solution{
    @Override
    public void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        k = k % n;
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int j = arr.length-k;j<arr.length;j++){
            arr2.add(arr[j]);
        }
        for(int i=arr.length-1;i>=k;i++){
            arr[i]=arr[i-k];
        }
        for(int i=0;i<k;i++){
            arr[i]= arr2.get(i);
        }

        Helper.printArray(arr);


    }
}
