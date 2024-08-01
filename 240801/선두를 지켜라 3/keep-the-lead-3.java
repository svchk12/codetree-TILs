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


        int idxA = 1;
        for(int i = 0; i < N; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j< t; j++){
                arr1[idxA] = arr1[idxA - 1] + v; 
                idxA++;
            }
            
        }

        int idxB = 1;
        for(int i = 0; i < M; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j = 0; j< t; j++){
                arr2[idxB] = arr2[idxB - 1] + v; 
                idxB++;
            }
        }

        int idx = idxA > idxB ? idxA : idxB;

        int leader = 0, ans = 0;
        for(int i = 1; i <= idx; i++){
            if(arr1[i] > arr2[i]){
                if(leader == 2 || leader == 3){
                    ans++;
                }
                leader = 1;
            }

            else if(arr1[i] == arr2[i]){
                if(leader != 3){
                    leader = 3;
                    ans++;
                }
            }


            else if(arr1[i] < arr2[i]){
                if(leader == 1 || leader == 3){
                    ans++;
                }
                leader = 2;
            }
        }
        System.out.print(ans);
    }
}