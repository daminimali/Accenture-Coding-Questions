/* Find the Minimum Value and Its Index in the Array
Problem Description:
Given an integer array, find the minimum value and its index in the array.
*/
import java.util.Scanner;
public class FindMinAndIndex {
    public static int[] minValueAndIndex(int arr[]){
        int min = arr[0];
        int index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        return new int[]{min,index};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result[] = minValueAndIndex(arr);
        System.out.println("The minimum element is: " + result[0]);
        System.out.println("The index of the minimun element is: " + result[1]);

    }
}
