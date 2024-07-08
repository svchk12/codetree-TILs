import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String sub1 = str.substring(0,1);
        String sub2 = str.substring(1,2);

        String strRpl = str.replaceAll(sub2, sub1);

        System.out.println(strRpl);
        
    }
}