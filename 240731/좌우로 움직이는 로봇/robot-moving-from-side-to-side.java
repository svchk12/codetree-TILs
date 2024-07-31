import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr1 = new int[2000001];
        int [] arr2 = new int[2000001];

        int idxA = 1;
        int point = 1000000;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            String d = sc.next();
            for(int j = 1; j <= t; j++){
                if(d.equals("R")){
                    point++;
                    arr1[idxA++] = point;
                }else if(d.equals("L")){
                    point--;
                    arr1[idxA++] = point;
                }
            }
        }

        for(int i = idxA; i < 2000001; i ++){
            arr1[i] = point;
            
        }

        int idxB = 1;
        point = 1000000;
        for(int i = 0; i < m; i++){
            int t = sc.nextInt();
            String d = sc.next();
            for(int j = 1; j <= t; j++){
                if(d.equals("R")){
                    point++;
                    arr2[idxB++] = point;
                }else if(d.equals("L")){
                    point--;
                    arr2[idxB++] = point;
                }
            }
        }

        for(int i = idxB; i < 2000001; i ++){
            arr2[i] = point;
        }

        int lnegth = idxA >= idxB ? idxA : idxB;
        
        int cnt = 0;
        for(int i = 1; i <= lnegth; i++){
            if(arr1[i-1] != arr2[i-1]){
                if(arr1[i] == arr2[i]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}