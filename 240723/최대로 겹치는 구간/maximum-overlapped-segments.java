import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[201];

        for(int i = 0; i < n; i++ ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            a = a + 100;
            b = b + 100;

            for(int j = a; j <b; j++){
                arr[j]++;    
            }
        }
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}