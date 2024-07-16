import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];

        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        for(int i = 0; i <= n; i++){
            if(i == 1){
                System.out.print(arr[i] + " ");
            }else{
                if(i % 2 != 0){
                    System.out.print(arr[i/2+1] + " ");
                }
            }
        }
    }
}