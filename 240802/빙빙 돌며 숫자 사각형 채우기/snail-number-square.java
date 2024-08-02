import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static boolean inRange(int x, int y, int n, int m) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int x = 0;
        int y = 0; 
        int dirNum = 0;

        int[][] arr = new int[n][m];

        arr[x][y] = 1;

        for(int i = 2; i <= n * m; i++){
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!inRange(nx, ny, n, m) || arr[nx][ny] != 0){
                dirNum = (dirNum + 1) % 4; 
            }

            x = x + dx[dirNum];
            y = y + dy[dirNum];
            //System.out.println("x = " + x + " / y = " + y + " / i = " + i);
            arr[x][y] = i;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}