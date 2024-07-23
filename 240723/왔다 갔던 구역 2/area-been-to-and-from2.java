import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[2001];
        int start = 1000;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            String command = sc.next();

            if(command.equals("R")){
                for(int j = 0; j < x; j++){
                    arr[start]++;
                    if(j < x){
                        start++;
                    }
                    
                }
            }else{
                for(int j = 0; j < x; j++){
                    arr[start]++;
                    if(j < x){
                        start--;
                    }
                }
            }
        }

        int cnt = 0;
        int startIdx = 0;
        int endIdx = 0;
        for(int i = 0; i < 2001; i++){
            if(arr[i] >= 2){
            cnt++;
        }
    }
    System.out.println(cnt);
    }
}