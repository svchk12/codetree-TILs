import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cal(n);
    }

    public static void cal(int n){
        int[] arr = new int[20];
        int cnt = 0;

        while(true){
            if(n < 2){
                arr[cnt++] = n;
                break;
            }else{
                arr[cnt++] = n % 2;
                n = n / 2;
            }
        }

        for(int i = cnt-1; i >=0; i--){
            System.out.print(arr[i]);
        }

    }
}