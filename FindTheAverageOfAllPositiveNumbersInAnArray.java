/*Find the Average of All Positive Numbers in an Array
Given an array of integers, find the average of all positive numbers in the array.
*/
import java.util.Scanner;
public class AveragePositive {
    public static double avgPositive(int arr[]){
        int sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        if( count == 0){
            return 0.0;
        }
        else {
            return (double) sum / count;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(avgPositive(arr));
    }
}
