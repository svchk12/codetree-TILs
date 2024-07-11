import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        cal(N);
    }

    public static void cal(int n){
        int sum = 0;
        for(int i = 1; i <=n; i++){
            sum += i;
        }

        System.out.println(sum/10);
    }
}