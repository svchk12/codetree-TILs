import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] arr = new double[8];
        double sum = 0;


        for(int i = 0; i < 8; i++){
            double a = sc.nextDouble();
            arr[i] = a;
            sum +=a;
        }

        System.out.println(sum/8);
    }
}