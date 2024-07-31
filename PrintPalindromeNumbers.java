/*Instructions: You are required to write the code. You can click on compile and run anytime to check compilation/execution status. The code should be logically/syntactically correct.
Question: Write a program in C such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.
Test Cases:
TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.
Test Case 2:
Input:
100,200
Expected Result:
101 , 111 , 121 , 131 , 141 , 151 , 161 , 171 , 181 , 191.
*/

import java.util.Scanner;
public class PrintPalindromes {
    public static boolean isPalindrome(int number){
        int original = number;
        int revNum = 0;

        while(number != 0){
            int ld = number % 10;
            number = number / 10;

            revNum = (revNum * 10) + ld;
        }
        if(revNum == original){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lowerLimit = sc.nextInt();
        int upperLimit = sc.nextInt();

        for(int i=lowerLimit;i<=upperLimit;i++){
            if(isPalindrome(i)){
                System.out.println(i);
            }
        }
    }
}
