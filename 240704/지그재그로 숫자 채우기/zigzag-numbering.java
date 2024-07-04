import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int [][]arr = new int[n][m];

        for(int i = 0 ; i < n; i ++){
            
            for(int j = 0; j < m; j++){
                if(j == 0){
                    arr[i][j] = i;
                }
                if(i == 0){
                    if(j % 2 = 0){
                        arr[i][j] = i + 9
                    }
                }
            }
        }
        
    }
}