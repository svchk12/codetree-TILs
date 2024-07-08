import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String last = str.substring(str.length()-1, str.length());
        String strRpl = str.substring(0,2) + str.substring(3);
        strRpl = strRpl.substring(0, strRpl.length()-2) + last;
        System.out.println(strRpl);
    }
}