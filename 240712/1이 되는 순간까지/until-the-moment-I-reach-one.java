import java.util.Scanner;
public class Main {
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cal(n));
    }

    public static int cal(int n){
        if(n == 1){
            return cnt;
        }

        if(n % 2 == 0){
            cnt++;
            return cal(n/2);
        }else{
            cnt++;
            return  cal(n/3);
        }
    }
}