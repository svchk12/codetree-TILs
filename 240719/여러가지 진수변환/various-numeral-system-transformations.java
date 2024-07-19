import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        cal(N, B);
    }

    public static void cal(int N, int B){
        int[] arr = new int[20];
        int cnt = 0;

        while(true){
            if(N < B){
                arr[cnt++] = N;
                break;
            }else{
                arr[cnt++] = N % B;
                N = N / B;
            }
        }

        for(int i = cnt-1; i >=0; i--){
            System.out.print(arr[i]);
        }

    }
}