import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }

        for(int j = 0; j < 10; j++){
            if(arr[j] < 250){
                sum += arr[j];
                cnt++;
            }else{
                break;
            }  
        }
        System.out.printf("%d %.1f", sum, (double)sum / cnt);
    }
}