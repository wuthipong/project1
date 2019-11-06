import java.util.Scanner;
public class NewClass1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sword =0 ;
        int shield=0;
        int helmet=0;
        do{
        if(a>10){
            sword+=1;
            a-=10;
        }
        if (a>8){
            shield+=1;
            a-=8;
        }
        if(a>3){
            helmet+=1;
            a-=3;
        }
        }while(a>2);
        System.out.println(sword+" "+shield+" "+helmet+" "+a);
    }
}