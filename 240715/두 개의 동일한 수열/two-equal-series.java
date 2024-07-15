import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Integer [] A = new Integer[n];
        Integer [] B = new Integer[n];

        for(int i = 0; i <n; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i <n; i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        boolean flag = true;

        for(int i = 0; i < n; i++){
            if(A[i] != B[i]){
                flag = false;
                break;
            }
        }

        if(!flag){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
}