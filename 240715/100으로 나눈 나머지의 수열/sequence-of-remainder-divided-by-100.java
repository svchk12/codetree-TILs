import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cal(n));
    }

    public static int cal(int n){
        if(n == 1){
            return 2;
        }

        if(n == 2){
            return 4;
        }

        return cal(n-1) * cal(n-2) % 100;        
    }
}