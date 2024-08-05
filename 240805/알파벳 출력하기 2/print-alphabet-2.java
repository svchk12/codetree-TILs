import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 65;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(cnt >90 ){
                    cnt = 65;
                }
                if(i > j){
                    System.out.print("  ");    
                }else{
                    System.out.print((char)cnt + " ");
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}