import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static int[] dx = new int[]{0, 1,  0, -1};
    public static int[] dy = new int[]{1, 0, -1,  0};
    public static int[][] arr = new int[100][100];
    public static boolean inRange(int x, int y, int n) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static int search(int x, int y, int n){
        int cnt = 0;
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(inRange(nx, ny, n) && arr[nx][ny]==1){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        

        int[]dx = new int[]{-1, 0, 1, 0};
        int[]dy = new int[]{0, 1, 0, -1};

        for(int i = 0; i < m; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            r--;
            c--;
            arr[r][c] = 1;
            if(search(r, c, n) == 3){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }


        //2차원 배열로 풀이
        // int[][] arr = new int[102][102];

        // for(int i = 0; i < m; i++){
        //     int r = sc.nextInt();
        //     int c = sc.nextInt();
        //     arr[r][c] = 1;
            
        //     int cnt = 0;

        //     if(arr[r-1][c] == 1){
        //         cnt++;
        //     }
        //     if(arr[r+1][c] == 1){
        //         cnt++;
        //     }
        //     if(arr[r][c-1] == 1){
        //         cnt++;
        //     }
        //     if(arr[r][c+1] == 1){
        //         cnt++;
        //     }

        //     if(cnt == 3){
        //         System.out.println(1);
        //     }else{
        //         System.out.println(0);
        //     }
            
        // }
    }
}