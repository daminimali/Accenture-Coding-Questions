// The function accepts an integer array ‘arr’ of size ‘n’ as its argument. Each element of ‘arr’ represents the number of chocolates distributed to a person. The function needs to return the minimum number of chocolates that need to be distributed to each person so that the difference between the chocolates of any two people is minimized.
import java.util.Scanner;
import java.util.Arrays;
public class ChocolateDistribution {
    public static int chocolateDistribution(int n, int arr[], int k){
        if(n == 0 || k == 0){
            return 0;
        }
        Arrays.sort(arr);

        if(n<k){
            return -1;
        }
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i+k-1<n;i++){
            int diff = arr[i+k-1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(chocolateDistribution(n,arr,k));
    }
}
