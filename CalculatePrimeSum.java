/* Problem Statement: Calculate Prime Sum
Implement the function:
Int CalculatePrimeSum(int m, int n);
Calculate and return the sum of prime numbers between ‘m’ and ‘n’ (inclusive).
Note: 0 < m <= n
*/
import java.util.Scanner;
public class PrimeSumCalculate {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        if(num == 2){
            return true;
        }

        if(num % 2 == 0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int primeSum(int m, int n){
        int sum = 0;
        for(int i=m;i<=n;i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(primeSum(m,n));
    }
}
