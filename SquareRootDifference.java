/*Problem Statement: Square Root Difference
Implement the function:
Int SquareRootDifference(int m, int n);
Calculate and return the difference between the sum of square roots of even numbers and the sum of square roots of odd numbers in the range from ‘m’ to ‘n’ (inclusive).
Note: 0 < m <= n
*/

import java.util.Scanner;
public class SqrtDiff {
    public static double sqrtSum(int m, int n){
        double evenSum = 0, oddSum = 0;
        for(int i=m;i<=n;i++){
            double sqrtRoot = Math.sqrt(i);
            if(i % 2 == 0){
                evenSum += sqrtRoot;
            }
            else{
                oddSum += sqrtRoot;
            }
        }
        return Math.abs(evenSum - oddSum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(sqrtSum(m,n));
    }
}
