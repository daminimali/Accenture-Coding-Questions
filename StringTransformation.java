// The function accepts a string ‘str’ as its argument. The function needs to return the transformed string by replacing all occurrences of the character ‘a’ with the character ‘b’ and vice versa.
import java.util.Scanner;
public class StringTransformation {
    public static String transformation(String input){
        char [] str = input.toCharArray();

        for(int i=0;i<input.length();i++){
            if(str[i] == 'a'){
                str[i] = 'b';
            }
            else if(str[i] == 'b'){
                str[i] = 'a';
            }
        }
        return new String(str);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(transformation(input));
    }
}
