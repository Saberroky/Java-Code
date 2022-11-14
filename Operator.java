
import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        //declear variable
        double a , b;
        System.out.println("please enter the 2 number: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        //addition operator
        System.out.println("a+b =" + (a+b));
        //subtraction
        System.out.println("a-b = " +(a-b));
        //multification
        System.out.println("a*b = " +(a*b));
        //division
        System.out.println("a/b = " +(a/b));
        //modulo
        System.out.println("a%b = " +(a%b));
        //create variables
        int c = 7, d = 11;
        //value 0f a and b
        System.out.println("a is " + c + "  b is " + d);
        // == operator
        System.out.println(c==d);  //false
        // != operator
        System.out.println(c!=d); //true
        // > operator
        System.out.println(c>d);  //false
        // < operator
        System.out.println(c<d); //true
        // >=operator
        System.out.println(c>=d); //false
        // <= operator
        System.out.println(c<=d); //true
        int e =11, f = 22;
        int result1, result2;
        System.out.println("e is: " +e);
        result1 = ++e;
        result2= --f;
        System.out.println("after increment " +result1);
        System.out.println("after drecement " +result2);
        int fDay = 29;
        String result3;
        result3 = (fDay == 28) ? "not a leap year" : "leap year";
        System.out.println(result3);


    }
}
