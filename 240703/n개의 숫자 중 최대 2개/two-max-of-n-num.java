import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Integer n = sc.nextInt();
       Integer[] arr = new Integer[n];
       for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
       }

       Arrays.sort(arr, Collections.reverseOrder());
       System.out.print(arr[0]+" ");
       System.out.print(arr[1]+" ");

    }
}