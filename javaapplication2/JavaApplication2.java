package javaapplication2;
import java.util.Scanner;
import java.lang.Math;
public class JavaApplication2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = sc.nextInt();
     double root = Math.sqrt((b*b)-(4*a*c));
     double a1 = (((-b)+root)/(2*a));
     double a2 = ((-b-root)/(2*a));
     if (root <= 0){
        System.out.println("error");
     }else {
        System.out.println("The answer is" + a1 + "and" + a2);
    }
    }
}
