import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] arr = new int[2][4];

        //배열 입력
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //가로 평균
        
        for(int i = 0; i < 2; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                sum = sum + arr[i][j];
            }
            System.out.printf("%.1f ", (double)sum/4);
        }
        System.out.println();

        //세로 평균
        for(int j = 0; j < 4; j++){
            int sum = 0;
            for(int i = 0; i < 2; i++){
                sum = sum + arr[i][j];
            }
            System.out.printf("%.1f ", (double)sum/2);
        }
        System.out.println();
        
        //전체 평균
        int sum = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                sum = sum + arr[i][j];
            }
        }
        System.out.printf("%.1f ", (double)sum/8);
        
    }
}