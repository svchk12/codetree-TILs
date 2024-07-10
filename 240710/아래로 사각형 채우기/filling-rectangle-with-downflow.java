import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int [][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            int cnt = i + 1;
            for(int j = 0; j < n; j++){
                if(j == 0){
                    arr[i][j] = cnt;
                }else{
                    arr[i][j] = cnt + n;
                    cnt = arr[i][j];
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