import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum2 = 0;
        int sum3 = 0;
        int cnt = 0;
        double avg;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(i % 2 != 0){
                sum2 = sum2 + arr[i];
            }
        }

        for(int i = 0; i < 10; i++){
            if(i % 3 == 2){
                sum3 = sum3 + arr[i];
                cnt++;
            }
        }

        System.out.printf("%d %.1f", sum2, (double)sum3 / cnt);


        
        
    }
}