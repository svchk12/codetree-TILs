import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();  
        cal(n, m);      
    }

    public static void cal(int n, int m){
        int answer = 0;
        int min = 0;

        if(n < m){
            min = n;
        }else{
            min = m;
        }
        //Math.min(n, m) => 최소값 구할 수 있음

        for(int i = 1; i <= min; i++){
            if(n % i == 0 && m % i == 0){
                answer = i;
            }
        }

        System.out.println(answer);

    }
}