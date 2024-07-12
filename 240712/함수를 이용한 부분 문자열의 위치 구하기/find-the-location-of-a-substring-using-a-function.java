import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static String str1 = sc.next();
    public static String str2 = sc.next();

    public static void main(String[] args) {
        compare();
    }

    public static void compare(){
        int index = str1.indexOf(str2);
        System.out.println(index);
    }
}