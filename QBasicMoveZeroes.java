import java.util.Scanner;

public class QBasicMoveZeroes implements  Solution{
    @Override
    public void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int corrPlace=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[corrPlace]=arr[i];
                corrPlace++;
            }
        }
        for(int i=corrPlace;i<arr.length;i++){
            arr[i]=0;
        }

        Helper.printArray(arr);
    }
}
