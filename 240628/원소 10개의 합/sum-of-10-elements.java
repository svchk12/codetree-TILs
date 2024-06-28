import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        for(int i = 0; i < 10; i++){
            int a = sc.nextInt();
            arr[i] = a;
            sum +=a;
        }
        System.out.println(sum);
    }
}