import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();  
        System.out.println(cal(n, m));
    }

    public static int cal(int n, int m){
        if(m == 0){
            return n;
        }
        return cal(m, n % m);
    }
}