import java.util.Scanner;
//12345
//23451
public class QBasicLeftRotateByOne implements Solution{
    @Override
    public void solve(Scanner sc) {
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int elem=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=elem;

        Helper.printArray(arr);

    }
}
