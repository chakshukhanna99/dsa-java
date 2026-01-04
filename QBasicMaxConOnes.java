import java.util.Scanner;

public class QBasicMaxConOnes implements Solution{
    @Override
    public void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int currMax=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                currMax++;
                if(max<currMax){
                    max=currMax;
                }
            }else {
                currMax=0;
            }
        }
        System.out.println(max);
    }
}
