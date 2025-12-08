import java.util.*;

public class Q1_MoveZeroes implements Solution {
    public void solve(Scanner sc){
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0) arr[count++] = arr[i];
        }
        while(count<n) arr[count++] = 0;

        System.out.println(Arrays.toString(arr));
    }
}