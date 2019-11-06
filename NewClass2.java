import java.util.Scanner;
public class NewClass2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String g = "Fortune ";
        String b = "\nUnfortunate ";
        switch(day){
            case "Monday" : System.out.println(g+"Purple"+b+"Red");break;
            case "Tuesday" : System.out.println(g+"Orange"+b+"Yellow, White");break;
            case "Wednesday" : System.out.println(g+"Black, Brown, Gray"+b+"Pink");break;
            case "Thursday" : System.out.println(g+"Red"+b+"Purple");break;
            case "Friday" : System.out.println(g+"Pink"+b+"Black, Blue, Gray");break;
            case "Saturday" : System.out.println(g+"Blue, Baby Blue"+b+"Green");break;
            case "Sunday" : System.out.println(g+"Green"+b+"Baby Blue");break;
            default : System.out.println("Input is invalid");
        }
    }
}
