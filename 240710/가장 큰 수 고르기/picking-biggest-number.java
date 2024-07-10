import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int INT_MAX = Integer.MIN_VALUE;
        int maxVal = INT_MAX;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);

    }
}