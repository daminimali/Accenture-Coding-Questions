// The function accepts a string ‘str’ as its argument. The function needs to determine whether the string is a palindrome or not. A palindrome is a word or phrase that reads the same backward as forward.
import java.util.Scanner;
public class Palindrome {
    public static boolean ispalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(ispalindrome(str));
    }
}
