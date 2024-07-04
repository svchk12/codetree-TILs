import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] arr = new int[2][4];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //가로평균
        for(int i = 0; i < 2; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                sum = sum + arr[i][j];
            }
            double avg = (double)sum / 4;
            System.out.printf("%.1f ", avg);
        }
        System.out.println();

        // //세로평균
        
        for(int i = 0; i < 4; i++){
            int sum = 0;
            sum = sum + arr[0][i] + arr[1][i];
            double avg = (double)sum / 2;
            System.out.printf("%.1f ", avg);

        }
        System.out.println();

        //전체평균
        int totalSum = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                totalSum = totalSum + arr[i][j];
            }
        }
        double avg = (double)totalSum / 8;
        System.out.printf("%.1f ", avg);
    }
}