import java.util.Scanner;
public class NewClass{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int year = (((a/24)/60)/365);
    int day = (((a/24)/60)%365);
      System.out.println(year+" "+day);
            }
}

