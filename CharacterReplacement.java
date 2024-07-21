/* Character Replacement
Problem Description:
Given a string str, a character ch1, and a character ch2, replace all occurrences of ch1 in str with ch2 and vice versa.
*/
import java.util.Scanner;
public class CharacterReplacement {
    public static String charReplacement(String str, char ch1, char ch2){
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ch1){
                arr[i] = ch2;
            }
            else if(arr[i] == ch2){
                arr[i] = ch1;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        System.out.println(charReplacement(str,ch1,ch2));
    }
}
