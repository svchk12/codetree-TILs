import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comm = sc.next();
        char[] commArr = comm.toCharArray();

        int x = 0;
        int y = 0;
        int dir = 0;       
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0}; 
        int time = 0;

        for(int i = 0; i < commArr.length; i++){
            if(commArr[i] == 'R'){
                dir = (dir + 1) % 4;
                time++;
                continue;
            }
            else if(commArr[i] == 'L'){
                dir = (dir + 3) % 4;
                time++;
                continue;
            }
            else if(commArr[i] == 'F'){
                x = x + dx[dir];
                y = y + dy[dir];
                time++;
                if(x == 0 && y== 0){
                    System.out.println(time);
                    return;
                }
            }
        }
        System.out.println(-1);


    }
}