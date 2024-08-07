/* Check if an Array Contains a Given Element
Problem Description:
Given an integer array and an integer element, check if the array contains the element.
*/
import java.util.Scanner;
public class SearchAnElement {
    public static boolean searchElement(int arr[], int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        System.out.println(searchElement(arr,element));
    }
}
