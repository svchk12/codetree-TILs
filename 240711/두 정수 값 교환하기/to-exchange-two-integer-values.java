import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        change(n, m);
    }

    public static void change(int n, int m){
        int temp = n;
        n = m;
        m = temp;
        System.out.println(n + " " + m);
    }
}