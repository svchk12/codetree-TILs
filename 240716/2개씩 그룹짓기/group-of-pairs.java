import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] arr = new Integer[n*2];
        for(int i = 0; i < n*2; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int max = arr[0] + arr[(2*n)-1];
        int [] maxArr = new int[n];
        
        for(int i = 0; i < n; i++){
            int sum = 0;
            sum = arr[i] + arr[(2*n)-i-1];
            if(sum >= max){
                max = sum;
                maxArr[i] = sum;
            }
        }
        Arrays.sort(maxArr);
        System.out.println(maxArr[n-1]);


    }
}