/* Problem Statement: Reverse and Add
Implement the function:
Int ReverseAndAdd(int m, int n);
Calculate and return the sum of numbers obtained by reversing the digits of each number in the range from ‘m’ to ‘n’ (inclusive).
Note: 0 < m <= n
*/
import java.util.Scanner;
public class ReverseAndAdd {
    public static int reverseSum(int m, int n){
        int sum = 0;
        for(int i=m;i<=n;i++){
            int revNum = 0;
            int originalNum = i;
            while(originalNum > 0){
                int ld = originalNum % 10;
                originalNum = originalNum / 10;
                revNum = (revNum * 10) + ld;
            }
            sum += revNum;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(reverseSum(m,n));
    }
}
