import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [][] arr = new int[n+1][n+1];

        int m = sc.nextInt();    
        
        for(int k = 0; k < m; k++){
            int r = sc.nextInt();
            int c = sc.nextInt();

            for(int i = 1; i < n + 1; i++){
                for(int j = 1; j < n + 1; j++){
                    arr[r][c] = 1;
                }
            }
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < n + 1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}