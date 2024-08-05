import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 65;

        System.out.print((char)90);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(cnt >=90 ){
                    cnt = 65;
                }
                System.out.print((char)cnt);
                cnt++;
            }
            System.out.println();
        }
    }
}