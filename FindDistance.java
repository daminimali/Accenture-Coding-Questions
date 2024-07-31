/*Instructions: You are required to write the code. You can click on compile & run anytime to check the compilation/ execution status of the program. The submitted code should be logically/syntactically correct and pass all the test cases.
Ques: The program is supposed to calculate the sum of  distance between three points from each other.
For
x1 = 1 y1 = 1
x2 = 2 y2 = 4
x3 = 3 y3 = 6
Distance is calculated as : sqrt(x2-x1)2 + (y2-y1)2
*/
import java.util.Scanner;
public class FindDistance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float x3 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float y3 = sc.nextFloat();

        float a = (float)Math.sqrt(Math.pow(x1-x2, 2) +Math.pow(y1-y2, 2));
        float b = (float)Math.sqrt(Math.pow(x3-x2, 2) +Math.pow(y3-y2, 2));
        float c = (float)Math.sqrt(Math.pow(x1-x3, 2) +Math.pow(y1-y3, 2));

        System.out.println(a + b + c);

    }
}
