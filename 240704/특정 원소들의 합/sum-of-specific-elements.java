import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[][] = new int[4][4];

        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for(int j = 0; j < 4; j ++){
            for(int i = 0; i + j < 4; i++){
                sum = sum + arr[i+j][j];
            }
        }
        System.out.println(sum);
    }
}