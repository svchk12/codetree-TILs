import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int n, k;
    public static int[] dx = new int[]{1, 0,  -1, 0};
    public static int[] dy = new int[]{0, 1, 0,  -1};
    public static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new char[n][n];
        for(int i = 0; i < n; i++){
            String d = sc.next();
            for(int j = 0; j < n; j++){
                arr[i][j] = d.charAt(j);
            }
        }

        k = sc.nextInt();

        int x = 0;
        int y = 0;
        Point[] point = new Point[4 * n];

        int dir = 1;
        int direction = 0;
        point[0] = new Point(x, y, direction);

        for(int i = 1; i < 4; i++){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(nx < 0 || ny < 0 || nx >=n || ny >= n){
                dir = (dir + 3) % 4;
                direction = (direction + 3) % 4;
                point[i] = new Point(x, y, direction);
                continue;
            }

            point[i] = new Point(nx, ny, direction);
            x = nx;
            y = ny;
        }
        System.out.println(bfs(point[k-1]));
    }

    public static int bfs(Point cur){
        int x = cur.x;
        int y = cur.y;
        int dir = cur.dir;

        int ans = 0;
        while(true){
            int nx = 0;
            int ny = 0;

            if(arr[x][y] == '/'){
                if(dir % 2 == 0){
                    dir = (dir + 3) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                    ans++;
                }else{
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                    ans++;
                }
            }
            else{
                if(dir % 2 == 0){
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                    ans++;
                }else{
                    dir = (dir + 3) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                    ans++;
                }
            }
            if(nx < 0 || ny < 0 || nx >= n || ny >= n){
                break;
            }
            x = nx;
            y = ny;
        }
        return ans;
    }
}



class Point{
    int x;
    int y;
    int dir;

    public Point(int x, int y, int dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
}