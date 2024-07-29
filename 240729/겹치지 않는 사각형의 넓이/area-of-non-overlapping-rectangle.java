import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[2001][2001];
        int minus = 0;
        for(int i = 0; i < 3; i++){
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
                if(i <= 1){
                    if(arr[j][k] == 0){
                    arr[j][k]= 1;
                    }
                }else{
                    if(arr[j][k] == 1){
                        minus++;
                    }
                }
            }
          }
        }

        int sum = 0;
        for(int i = 0; i < 2001; i++){
            for(int j = 0; j < 2001; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum - minus);


    }
}