import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[100][100];

        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr[r][c] = 1;
            
            int cnt = 0;

            if(arr[r-1][c] == 1){
                cnt++;
            }
            if(arr[r+1][c] == 1){
                cnt++;
            }
            if(arr[r][c-1] == 1){
                cnt++;
            }
            if(arr[r][c+1] == 1){
                cnt++;
            }

            if(cnt == 3){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
            
        }
    }
}