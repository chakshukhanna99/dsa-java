import java.util.Scanner;

public class QBasicSingleElem implements Solution{
    @Override
    public void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int xor=0;
        for(int num: arr){
            xor=xor^num;
        }
        System.out.println(xor);
    }
}
