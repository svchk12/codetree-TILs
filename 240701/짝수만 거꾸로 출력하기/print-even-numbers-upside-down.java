import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int j = n; j >= 1; j--){
            if(arr[j-1] % 2 == 0){
                System.out.print(arr[j-1] + " ");
            }
        }
    }
}