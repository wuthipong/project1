import java.util.Scanner;
public class NewClass3 {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        if (a.equals("0")&&b.equals("0")){
            if(c.equals("-")&&d.equals("-")){
                System.out.println("NEUTRAL");
            }if(c.equals("1")&&d.equals("-")){
                System.out.println("MuR");
            }if(c.equals("-")&&d.equals("1")){
                System.out.println("DnD");
            }
        if (a.equals("1")&&b.equals("0")){
            if(c.equals("-")&&d.equals("-")){
                System.out.println("MuR");
            }if(c.equals("1")&&d.equals("-")){
                System.out.println("NEUTRAL");
            }if(c.equals("-")&&d.equals("1")){
                System.out.println("DnD");
            }
        }if (a.equals("0")&&b.equals("1")){
            if(c.equals("-")&&d.equals("-")){
                System.out.println("DnD");
            }if(c.equals("1")&&d.equals("-")){
                System.out.println("NEUTRAL");
            }if(c.equals("-")&&d.equals("1")){
                System.out.println("Mur");
            }
     }
}
}}