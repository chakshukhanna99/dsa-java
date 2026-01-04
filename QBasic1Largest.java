import java.util.Scanner;

public class QBasic1Largest implements Solution{
 @Override
 public void solve(Scanner sc){
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     int max = Integer.MIN_VALUE;
     int min = Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
         if(arr[i]<min){
             min=arr[i];
         }
         if(arr[i]>max){
             max=arr[i];
         }
     }
     System.out.println(min+" "+max);
 }
}
