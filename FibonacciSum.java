/* Problem Statement: Fibonacci Sum
Implement the function:
Int FibonacciSum(int m, int n);
Calculate and return the sum of Fibonacci numbers in the range from ‘m’ to ‘n’ (inclusive).
Note: 0 < m <= n
*/
import java.util.Scanner;
public class FibonacciSum {
    public static int fibonacciSum(int m, int n){
        int a = 0, b = 1;
        int sum = 0;
        while(n>=b){
            if(b>=m && b<=n){
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(fibonacciSum(m,n));
    }
}
