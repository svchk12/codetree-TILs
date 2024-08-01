import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int[] di = new int[]{0, 1,  0, -1};
        int[] dj = new int[]{1, 0, -1,  0};

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int tCnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                int x = i;
                int y = j;
                int cnt = 0;

                for(int k = 0; k < n; k++){
                    int nx = x + di[k];
                    int ny = y + dj[k];
                    if(inRange(nx, ny, n) && arr[nx][ny]== 1){
                        cnt++;
                    }
                }

                if(cnt >= 3){
                    tCnt++;
                    cnt = 0;
                }
            }
        }
        System.out.println(tCnt);
    }

    public static boolean inRange(int x, int y, int n){
        return (0 <= x && x < n && 0 <= y && y <n);
    }
}