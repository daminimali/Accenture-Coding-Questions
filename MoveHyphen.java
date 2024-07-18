/* Implement the following functions.a

char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and hyphens (-). Implement the function to move all hyphens(-) in the string to the front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare
*/

import java.util.Scanner;
public class MoveHyphen {
    public static String moveHyphen(String str, int n){
        if(str == null){
            return null;
        }
        String res = "";
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='-'){
                res = str.charAt(i) + res;
            }
            else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(moveHyphen(str,str.length()));
    }
}
