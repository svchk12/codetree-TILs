import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int [] arr1 = new int[1000000];
        int [] arr2 = new int[1000000];


        int point = 0;
        int idx = 0;
        for(int i = 0; i < N; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j< t; j++){
                point = v * 1;
                arr1[++idx] = point; 
            }
            
        }

        point = 0;
        idx = 0;
        for(int i = 0; i < M; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j< t; j++){
                point = v * 1;
                arr2[++idx] = point; 
            }
        }

        int leader = 0, ans = 0;
        for(int i = 1; i <= idx; i++){
            if(arr1[i] > arr2[i]){
                if(leader == 2){
                    ans++;
                }
                leader = 1;
            }
            else if(arr1[i] < arr2[i]){
                if(leader == 1){
                    ans++;
                }
                leader = 2;
            }
        }
        System.out.print(ans);
    }
}