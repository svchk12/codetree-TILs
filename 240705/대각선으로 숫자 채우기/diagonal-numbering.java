import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]arr = new int[n][m];
        int cnt = 1;
        
        
        for(int j = 0; j < m; j++){
            int currI = 0;
            int currJ = j;

            while(currJ >=0 && currI < n){
                arr[currI][currJ] = cnt;
                currI++;
                currJ--;
                cnt++;
            }
        }

        for(int i = 1; i < n; i++){
            int currI = i;
            int currJ = m-1;

            while(currJ >=0 && currI < n){
                arr[currI][currJ] = cnt;
                currI++;
                currJ--;
                cnt++;
            }

        }

        for(int i = 0; i < n; i++){
            for(int j = 0 ;j < m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}