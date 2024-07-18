// The function accepts two strings ‘str1’ and ‘str2’ as its argument. The function needs to return the index of the first occurrence of substring ‘str2’ in string ‘str1’ or -1 if the substring is not found.

import java.util.Scanner;
public class SubstringSearch {
    public static int searchSubstring(String str1, String str2){
        int index = str1.indexOf(str2);
        if(index != -1){
            return index;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(searchSubstring(str1,str2));
    }
}
