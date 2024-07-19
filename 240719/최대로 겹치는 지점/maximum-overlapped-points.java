import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[101];

        for(int i = 0; i < n; i++ ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j <= b; j++){
                arr[j]++;
            }
        }

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}