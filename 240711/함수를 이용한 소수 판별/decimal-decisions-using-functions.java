import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = sumPrime(a, b);
        System.out.println(answer);

    }

    public static int sumPrime(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            int cnt = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                sum+=i;
            }
        }
        return sum;
    }
}