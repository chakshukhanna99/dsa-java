import java.util.*;
public class Q2_RemoveNumber implements Solution {
    public void solve(Scanner sc){
        int n = sc.nextInt();
        int val = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int count=0;
        for(int x: arr) if(x!=val) arr[count++] = x;

        System.out.println("New Length: " + count);
        for(int i=0;i<count;i++) System.out.print(arr[i]+" ");
    }
}
