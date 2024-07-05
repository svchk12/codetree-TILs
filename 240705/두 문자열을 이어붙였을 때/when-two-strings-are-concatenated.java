import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();
        
        String combined1  = st1 + st2;
        String combined2  = st2 + st1;

        if(combined1.equals(combined2)){
            System.out.print(true);
        }else{
            System.out.print(false);
        }

    }
}