import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 65;

        for(int i = 1; i <= n; i++){
            if(cnt >=88 ){
                cnt = 65;
            }

            for(int j = 1; j <= i; j++){
                System.out.print((char)cnt);
                cnt++;
            }
            System.out.println();
        }
    }
}