import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];

        int cnt = 1;

        for(int j = n-1; j >=0; j--){
            for(int i = n-1; i >=0; i --){
                if(j % 2 != 0){
                    arr[i][j] = cnt;
                    cnt++;
                }
                else{
                    arr[n-i-1][j] = cnt;
                    cnt++;
                }
                
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}