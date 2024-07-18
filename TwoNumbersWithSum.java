// Given an array of integers and an integer sum, find a pair of numbers (a, b) in the array where a + b = sum.
import java.util.Scanner;
public class TwoNumbersWithSum {
    public static void twoNumberSum(int arr[], int sum){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println("Pais found:" + arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        twoNumberSum(arr,sum);
    }
}
