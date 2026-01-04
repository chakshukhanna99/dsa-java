import java.util.Scanner;

public class QBasicLinearSearch implements Solution{
    @Override
    public void solve(Scanner sc) {
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=3;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                ans=i;
                break;
            }
        }
        System.out.println("Find elem at pos: "+ ans);
    }
}
