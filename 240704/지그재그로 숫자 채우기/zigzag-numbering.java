import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int [][]arr = new int[n][m];
        int num = 0;

        for(int j = 0 ; j < m; j ++){
            for(int i = 0; i < n; i++){
               if(j % 2 == 0){
                arr[i][j] = num++;
               }else{
                arr[n-i-1][j] = num++;
               }
            }
        }

        for(int i = 0 ; i < n; i ++){
            for(int j = 0; j < m; j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}