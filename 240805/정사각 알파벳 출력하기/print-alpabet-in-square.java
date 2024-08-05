import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 65;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println((char)cnt);
                cnt++;
            }
            System.out.println();
        }
    }
}