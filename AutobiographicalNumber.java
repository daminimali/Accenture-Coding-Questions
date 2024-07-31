/*Problem Statement :
An Autobiographical Number is a number N such that the first digit of N represents the count of how many zeroes are there in N, the second digit represents the count of how many ones are there in N and so on.
You are given a function, def FindAutoCount(n):
The function accepts string “n” which is a number and checks whether the number is an autobiographical number or not. If it is, an integer is returned, i.e. the count of distinct numbers in ‘n’. If not, it returns 0.
Assumption:
The input string will not be longer than 10 characters.
Input string will consist of numeric characters.
Note:
If string is None return 0.
Example:
Input:
n: “1210”
Output:
3
Explanation:
0th position in the input contains the number of 0 present in input, i.e. 1, in 1st position the count of number of 1s in input i.e. 2, in 2nd position the count of 2s in input i.e. 1, and in 3rd position the count of 3s i.e. 0, so the number is an autobiographical number.
Now unique numbers in the input are 0, 1, 2, so the count of unique numbers is 3. So 3 is returned.

import java.util.Scanner;
public class AutobiographicalNumber {
    public static int findAutoCount(String n){
        if(n == null){
            return 0;
        }
        int length = n.length();
        for(int i=0;i<length;i++) {
            int expectedCount = Character.getNumericValue(n.charAt(i));
            int actualCount = countOccurrences(n, i);

            if (expectedCount != actualCount) {
                return 0;
            }
        }

        int digitSeen[] = new int[10];
        int distinctCount = 0;

        for(char c: n.toCharArray()){
            int digit = Character.getNumericValue(c);
            if(digitSeen[digit] == 0){
                digitSeen[digit] = 1;
                distinctCount++;
            }
        }
        return distinctCount;
    }
    private static int countOccurrences(String n, int digit){
        int count = 0;
        char target = (char)(digit + '0');
        for(char c: n.toCharArray()){
            if(c == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(findAutoCount(str));
    }
}
