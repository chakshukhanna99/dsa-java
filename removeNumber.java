import java.util.Scanner;

public class removeNumber {

    public int removeNegative(int arr[],int val){
        int count =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        removeNumber rn = new removeNumber();

        int newLength = rn.removeNegative(arr, val);
        System.out.println(newLength);
        System.out.print("Updated Array: ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
