import java.util.Scanner;
public class Main {
    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cal(n));
    }

    public static int cal(int n){
        
        if(Integer.toString(n).length() == 1){
            sum = sum + n * n;
            return sum;
        }else{
            int temp = n % 10;
            sum = sum + temp*temp;
            return cal(n / 10);
        }
    }
}