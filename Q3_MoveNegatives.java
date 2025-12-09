import java.util.Scanner;

public class Q3_MoveNegatives implements Solution{
    @Override
    public void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] nums=new int[n];
        int posIndex=0;
        int negIndex=1;

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                nums[posIndex]=arr[i];
                posIndex+=2;
            }else {
                nums[negIndex]=arr[i];
                negIndex+=2;
            }
        }
        Helper.printArray(nums);


    }
}
