import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();
    public static int m = sc.nextInt();
    public static int[] arr = new int[n+1];
    
    
    
    public static void main(String[] args) {
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < m; i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            int sum = 0;
            for(int j = a1; j <= a2; j++){
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }
    }
}