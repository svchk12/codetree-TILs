import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        
        
        int x = 0;
        int y = 0;
        int dir = 0;       
        
        int time = 0;
        for(int i = 0; i < n; i++){
            String d = sc.next();
            int v = sc.nextInt();

            for(int j = 0; j < v; j++){
                dir = getDirNum(d);
                x = x + dx[dir];
                y = y + dy[dir];
                time++;
                if(x == 0 && y == 0){
                    System.out.println(time);
                    return;
                }
            }
        }
        System.out.println(-1);
    }

    public static int getDirNum(String d){
        if(d.equals("N")){
            return 0;
        }
        else if(d.equals("E")){
            return 1;
        }
        else if(d.equals("S")){
            return 2;
        }else{
            return 3;
        }
    }

    public static boolean inRange(int x, int y) {
        return (0 <= x && x <= 1000 && 0 <= y && y <= 1000);
    }


    
}