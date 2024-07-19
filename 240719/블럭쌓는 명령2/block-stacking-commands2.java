import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < k; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j = start; j <= end; j++){
                arr[j] = arr[j] + 1;
            }
        }

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}