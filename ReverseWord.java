// The function accepts a string ‘str’ as its argument. The function needs to reverse the order of the words in the string.

import java.util.Scanner;
public class ReverseWord {
    public static String reverseWord(String str){
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWord(str));
    }
}
