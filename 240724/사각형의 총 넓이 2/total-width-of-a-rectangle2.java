import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [][] arr = new int[201][201];

        for(int i = 0; i < n; i++){
          int x1 = sc.nextInt();   
          int y1 = sc.nextInt();
          int x2 = sc.nextInt();
          int y2 = sc.nextInt();

          if(x1 < 0){
            x1 = x1 + 100;
          }
          if(y1 < 0){
            y1 = y1 + 100;
          }
          if(x2 < 0){
            x2 = x2 + 100;
          }
          if(y2 < 0){
            y2 = y2 + 100;
          }

          for(int j = x1; j < x2; j++){
            for(int k = y1; k< y2; k++){
                if(arr[j][k] == 0){
                    arr[j][k]++;
                }
            }
          }
        }

        int sum = 0;
        for(int i = 0; i < 201; i++){
            for(int j = 0; j < 201; j++){
                sum = sum + arr[i][j];
            }
        }

        System.out.println(sum);
    }
}