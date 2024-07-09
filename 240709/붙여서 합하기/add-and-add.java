import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        Integer AB = Integer.parseInt(A+B);
        Integer BA = Integer.parseInt(B+A);
        System.out.println(AB+BA);

    }
}