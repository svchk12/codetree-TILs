import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();   
        System.out.println(cal(n,m));     
    }

    public static int cal(int n, int m){
        int gcd = 0;
        gcd = fnGcd(n, m);
        return (n * m) / gcd;
    }

    public static int fnGcd(int n, int m){
        if(m == 0){
            return n;
        }
        return fnGcd(m , n % m);
    }
}