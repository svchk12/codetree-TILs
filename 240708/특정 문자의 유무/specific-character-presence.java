import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        
        if(s1.contains("ee")){
            System.out.print("Yes ");
        }else{
            System.out.println("No ");
        }

        if(s1.contains("ab")){
            System.out.print("Yes ");
        }else{
            System.out.println("No ");
        }

    }
}