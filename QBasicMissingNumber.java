import java.util.Scanner;
//1245
public class QBasicMissingNumber implements Solution{
    @Override
    public void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum =0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int el:arr){
            sum+=el;
        }
        int expected= n*(n+1)/2;
        int ans = expected-sum;
        System.out.println(ans);
    }
}
