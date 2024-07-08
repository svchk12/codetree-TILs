import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        char c1 = str1.charAt(0);
        char c2 = str2.charAt(0);
        
        int a = (int)c1;
        int b = (int)c2;

        if( a > b){
            System.out.printf("%d %d", a+b, a-b);
        }else{
            System.out.printf("%d %d", b+a, b-a);
        }

        
        
    }
}