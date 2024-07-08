import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.substring(0,2) + str.substring(3);
        String last = str.substring(str.length()-1, str.length());

        str = str.substring(0,str.length()-2) + last;
        
        System.out.println(str);
    }
}