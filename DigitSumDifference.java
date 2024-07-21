/*Problem Statement: Digit Sum Difference
Implement the function:
Int DigitSumDifference(int m, int n);
Calculate and return the absolute difference between the sum of digits of numbers divisible by 4 and the sum of digits of numbers divisible by 7, in the range from ‘m’ to ‘n’ (inclusive).
Note: 0 < m <= n
*/
import java.util.Scanner;
public class SumDifference {
    public static int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int sumOfDiff(int m, int n){
        int sum_4 = 0;
        int sum_7 = 0;

        for(int i=m;i<=n;i++){
            if(i % 4 == 0){
                sum_4 += digitSum(i);
            }
            if(i % 7 == 0){
                sum_7 += digitSum(i);
            }
        }
        return Math.abs(sum_4 - sum_7);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(sumOfDiff(m,n));
    }
}
