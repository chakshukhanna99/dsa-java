import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.max;

public class QBasicUnionArrays implements Solution{
    @Override
    public void solve(Scanner sc) {
        int n= sc.nextInt();
        int m = sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        List<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            }
            else if (arr2[j] < arr1[i]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
            else {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; j++;
            }
        }
        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        System.out.println(Union);
    }

}

