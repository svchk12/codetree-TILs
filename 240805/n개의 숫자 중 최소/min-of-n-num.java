import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final int INT_MAX = Integer.MAX_VALUE;
        
        int maxVal = INT_MAX;
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < maxVal){
                maxVal = arr[i];
                cnt++;
            }
        }
        // for(int i = 0; i < n; i++){
        //     if(arr[i] == maxVal)
            
        // }
        System.out.printf("%d %d", maxVal, cnt);

    }
}