/* Maximum Subarray Sum
Problem Description:
Given an array of integers, find the maximum subarray sum. A subarray is a contiguous subsequence of the array.
*/
import java.util.Scanner;
public class MaximunSubarraySum {
    public static int maxSum(int arr[]){
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for(int i=1;i<arr.length;i++){
            maxEndingHere = Math.max(arr[i], maxEndingHere+arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSum(arr));
    }
}
