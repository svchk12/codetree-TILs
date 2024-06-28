import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];

        for(int i = 0; i < n; i++){
            double score = sc.nextDouble();
            arr[i] = score;
        }

        double sum = 0;
        for(int j = 0; j < n; j ++){
            sum += arr[j];
        }
        double avg = sum / n;
        System.out.printf("%.1f", avg);
        System.out.println();
        if(avg >= 4.0){
            System.out.println("Perfect");
        }
        else if(avg < 4.0 && avg >= 3.0){
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }
    }
}