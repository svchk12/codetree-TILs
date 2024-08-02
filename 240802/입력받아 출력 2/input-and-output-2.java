import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // String a = sc.next();
        // String [] strArr = a.split("-");
        // System.out.print(strArr[0] + strArr[1]);

        sc.useDelimiter("-");
        int front = sc.nextInt();
        int back = sc.nextInt();
        System.out.print(front);
        System.out.print(back);
    }
}