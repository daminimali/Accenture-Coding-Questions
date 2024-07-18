// The function accepts an integer array ‘arr’ of size ‘n’ and an integer ‘d’ as its argument. The function needs to rotate the array ‘arr’ by ‘d’ positions to the right. The rotation should be done in place, without using any additional memory.

import java.util.Scanner;
public class ArrayRotation {
    public static void rotateArray(int n, int arr[], int d){
        d = d % n;
        int temp[] = new int[d];
        for(int i=0;i<d;i++){
            temp[i] = arr[n-d+i];
        }
        for(int i=n-1;i>=d;i--){
            arr[i] = arr[i-d];
        }
        for(int i=0;i<d;i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        rotateArray(n,arr,d);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
