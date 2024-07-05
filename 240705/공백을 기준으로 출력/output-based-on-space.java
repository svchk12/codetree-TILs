import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        String s1r = s1.replace(" ", "");
        String s2r = s2.replace(" ", "");
        System.out.print(s1r + s2r);
    }
}