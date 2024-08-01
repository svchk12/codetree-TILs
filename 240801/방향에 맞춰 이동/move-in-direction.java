import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[]{-1,0,0,1};
        int[] dy = new int[]{0,-1,1,0};

        int x = 0;
        int y = 0;

        for(int i = 0; i < n; i++){
            String direction = sc.next();
            int len = sc.nextInt();

            if(direction.equals("W")){
                for(int j = 0; j < len; j++){
                    x = x + dx[0];
                    y = y + dy[0];
                } 
            }

            if(direction.equals("S")){
                for(int j = 0; j < len; j++){
                    x = x + dx[1];
                    y = y + dy[1];
                } 
            }

            if(direction.equals("N")){
                for(int j = 0; j < len; j++){
                    x = x + dx[2];
                    y = y + dy[2];
                } 
            }

            if(direction.equals("E")){
                for(int j = 0; j < len; j++){
                    x = x + dx[3];
                    y = y + dy[3];
                } 
            }
        }

        System.out.println(x + " " + y);

    }
}