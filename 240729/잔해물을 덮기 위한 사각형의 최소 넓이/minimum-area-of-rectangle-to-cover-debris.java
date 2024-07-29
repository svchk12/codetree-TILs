import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[2001][2001];
        
        //첫번째 사각형 1로 채우기
        int x1 = sc.nextInt();   
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        x1 = x1 + 1000;
        y1 = y1 + 1000;
        x2 = x2 + 1000;
        y2 = y2 + 1000;
        
        for(int j = x1; j < x2; j++){
            for(int k = y1; k< y2; k++){
                arr[j][k]= 1;
            }
        }

        int x3 = sc.nextInt();   
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        x3 = x3 + 1000;
        y3 = y3 + 1000;
        x4 = x4 + 1000;
        y4 = y4 + 1000;

        for(int j = x3; j < x4; j++){
            for(int k = y3; k< y4; k++){
                arr[j][k]= 0;
            }
        }

        int xMax = 0;
        int yMax = 0;
        int xMin = 2001;
        int yMin = 2001;
        for(int i = 0; i < 2001; i++){
            for(int j = 0; j < 2001; j++){
                if(arr[i][j] == 1 && xMax < i)
                    xMax = i;
                if(arr[i][j] == 1 && yMax < j)
                    yMax = j;
                if(arr[i][j] == 1 && xMin > i)
                    xMin = i;
                if(arr[i][j] == 1 && yMin > j)
                    yMin = j;
            }
        }

        int cnt = 0;
        for(int i = xMin; i <= xMax; i++){
            for(int j = yMin; j <= yMax; j++){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}