import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n+1];
        for(int i = 0; i <= n; i ++){
            if(i == 0){
                arr[i] = 0;
            }else{
                arr[i] = sc.nextInt();
            }
        }
        cal(n, m, arr);
    }

    public static void cal(int n, int m, int[] arr){
        int sum = 0;
        while(m >= 1){
            sum = sum + arr[m];
            if(m % 2 != 0){
                m = m -1;
            }else{
                m = m / 2;
            }
        }
        System.out.println(sum);
    }
}