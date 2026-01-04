import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// nums = [10, 5, 2, 7, 1, 9], k = 15
public class QBasicSubArrayLongestSumK implements Solution{
    @Override
    public void solve(Scanner sc) {
        int n = sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        int sum=0;
//        int maxLength=0;
//        for(int i=0;i<n;i++){
//            sum=0;
//            for(int j=i;j<n;j++){
//                sum+=arr[j];
//                if(sum==k){
//                    maxLength=Math.max(j-i+1,maxLength);
//                }
//            }
//        }
//        System.out.println(maxLength);

        Map<Integer,Integer> preSum = new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen= i+1;
            }
            int rem=sum-k;
            if(preSum.containsKey(rem)){
                maxLen=Math.max(i-preSum.get(rem),maxLen);
            }
            if(!preSum.containsKey(sum)){
                preSum.put(sum,i);
            }
        }
        System.out.println(maxLen);

//        int n = nums.length;
//        int maxLen = 0;
//        int left = 0, right = 0;
//        int sum = nums[0];
//        while (right < n) {
//            while (left <= right && sum > k) {
//                sum -= nums[left];
//                left++;
//            }
//            if (sum == k) {
//                maxLen = Math.max(maxLen, right - left + 1);
//            }
//            right++;
//            if (right < n) {
//                sum += nums[right];
//            }
//        }
//
//        return maxLen;
    }
}
