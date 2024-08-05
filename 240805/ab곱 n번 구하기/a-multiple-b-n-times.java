import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = 1;
            for(int j = a; j <= b; j++){
                ans = ans * j;
            }
            System.out.println(ans);
        }
        
    }
}