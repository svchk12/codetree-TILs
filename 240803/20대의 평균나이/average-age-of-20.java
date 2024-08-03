import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while(true){
            int a = sc.nextInt();

            if(a >= 20 && a <= 29){
                sum = sum + a;
                cnt++;
            }else{
                double avg = (double) sum / cnt;
                System.out.printf("%.2f",avg);
                break;
            }
        }
        
    }
}