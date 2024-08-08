import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cal(n));
    }

    public static int cal(int n){
        if(n < 10){
            return n * n;
        }
        
        return cal(n / 10) + (n % 10)*(n % 10);
    }

    // public static int cal(int n){
    //     if(n < 10){
    //         return n * n;
    //     }
    //     int digit = n % 10;
    //     return cal(n / 10) + digit * digit;
    // }
}