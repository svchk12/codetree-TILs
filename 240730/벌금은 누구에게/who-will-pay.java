import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] students = new int[n+1];
        for(int i = 0; i < m; i++){
            int stNo = sc.nextInt();
            students[stNo]++;
            if(students[stNo] == k){
                System.out.println(stNo);
                return;
            }
        }
        System.out.println("-1");
    }
}