import java.util.Scanner;
public class NewClass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o = sc.next();
        int y = 0;
        for(int i =0;i<o.length() - 1;i++){
         for(int j = i+1;j<o.length();j++){
             if (o.toLowerCase().charAt(i) == o.toLowerCase().charAt(j));
             y++;
         }
        }
         if (y==0){
             System.out.println(o+" is not an isogram");
         }else
                System.out.println(o+" is an isogram");
    }
    }

