import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];

        int cnt = 1;
        boolean flag = true;

        for(int j = n-1; j >=0; j--){
            if(flag){
                for(int i = n-1; i >= 0; i--){
                    arr[i][j] = cnt;
                    cnt++;
                    flag = false;
                }
            }else{
                for(int i = 0; i < n; i++){
                    arr[i][j] = cnt;
                    cnt++;
                    flag = true;
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