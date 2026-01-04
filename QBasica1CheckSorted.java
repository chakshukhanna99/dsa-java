import java.util.Scanner;

public class QBasica1CheckSorted implements Solution{
    @Override
    public void solve(Scanner sc){
        boolean isSorted=true;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                isSorted=false;
                break;
            }
        }
        System.out.println("is Array Sorted "+isSorted);

    }
}
