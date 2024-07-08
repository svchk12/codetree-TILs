import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        String first = str.substring(0,1);

        str = str.substring(1, len) + first;
        System.out.println(str);

    }
}