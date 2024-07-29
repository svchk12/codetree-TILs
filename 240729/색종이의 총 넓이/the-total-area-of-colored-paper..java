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

          x1 = x1 + 100;
          y1 = y1 + 100;

          for(int j = x1; j < x1+ 8; j++){
            for(int k = y1; k< y1 + 8; k++){
                if(arr[j][k] == 0){
                    arr[j][k]= 1;
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