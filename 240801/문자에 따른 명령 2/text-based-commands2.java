import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};

        int x = 0;
        int y = 0;
        int dirNum = 3;

        String comm = sc.next();
        char[] arr = comm.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'L'){
                dirNum = (dirNum + 3) % 4;
            }

            if(arr[i] == 'R'){
                dirNum = (dirNum + 1) % 4;
            }

            if(arr[i] == 'F'){
                x = x + dx[dirNum];
                y = y + dy[dirNum];
            }
        }
        

        System.out.println(x + " " + y);
    }
}