import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[][] arr = new int[n+1][n+1];

        int[] dx = new int[]{0, 1, -1,  0};
        int[] dy = new int[]{1, 0,  0, -1};

        int r = sc.nextInt();
        int c = sc.nextInt();
        String d = sc.next();
        int moveDir = getDir(d);

        for(int i = 0; i < t; i++){
            int nx = r + dx[moveDir];
            int ny = c + dy[moveDir];
            
            if(!inRange(nx, ny, n)){
                moveDir = 3 - moveDir;
                continue;
            }

            r = r + dx[moveDir];
            c = c + dy[moveDir];
        }

        System.out.println(r + " " + c);

    }

    public static boolean inRange(int x, int y, int n) {
        return (0 < x && x <= n && 0 < y && y <= n);
    }

    public static int getDir(String d){
        if(d.equals("R")){
            return 0;
        }
        else if(d.equals("D")){
            return 1;
        }
        else if(d.equals("U")){
            return 2;
        }
        else{
            return 3;
        } 
    }
}