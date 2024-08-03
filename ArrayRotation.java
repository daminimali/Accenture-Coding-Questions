// The function accepts an integer array ‘arr’ of size ‘n’ and an integer ‘d’ as its argument. The function needs to rotate the array ‘arr’ by ‘d’ positions to the right. The rotation should be done in place, without using any additional memory.

import java.util.Scanner;
public class ArrayRotation {

    // Function to reverse a portion of the array from index start to end
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate the array to the right by d positions
    public static void rotateArray(int[] arr, int n, int d) {
        d = d % n;  // Handle the case where d >= n

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first d elements
        reverse(arr, 0, d - 1);

        // Reverse the remaining n-d elements
        reverse(arr, d, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        rotateArray(arr, n, d);
        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

