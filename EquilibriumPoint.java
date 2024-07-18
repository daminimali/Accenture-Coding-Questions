// The function accepts an integer array ‘arr’ of size ‘n’ as its argument. The function needs to return the index of an equilibrium point in the array, where the sum of elements on the left of the index is equal to the sum of elements on the right of the index. If no equilibrium point exists, the function should return -1.

import java.util.Scanner;
public class EquilibriumPoint {
    public static int point(int n, int arr[]){
        int totalsum = 0;
        int leftsum = 0;
        for(int i=0;i<n;i++){
            totalsum+=arr[i];
        }

        for(int i=0;i<n;i++){
            totalsum -= arr[i];
            if(leftsum == totalsum) {
                return i;
            }
            leftsum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(point(n,arr));
    }
}
