import java.util.Scanner;

public class QBasica1SecondLargest implements Solution{
    private int findSecondMax(int arr[]){
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sMax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>sMax){
                sMax=arr[i];
            }
        }
        return sMax;
    }

    @Override
    public void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sMax = findSecondMax(arr);
        System.out.println("Second Max is:" +sMax);
    }

}
