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

        int idx = 0;
        int point = 1000000;
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            String d = sc.next();
            for(int j = 0; j < t; j++){
                if(d.equals("R")){
                    point++;
                    arr1[idx++] = point;
                }else if(d.equals("L")){
                    point--;
                    arr1[idx++] = point;
                }
            }
        }

        for(int i = idx; i < 2000001; i ++){
            arr1[i] = point;
        }

        idx = 0;
        point = 1000000;
        for(int i = 0; i < m; i++){
            int t = sc.nextInt();
            String d = sc.next();
            for(int j = 0; j < t; j++){
                if(d.equals("R")){
                    point++;
                    arr2[idx++] = point;
                }else if(d.equals("L")){
                    point--;
                    arr2[idx++] = point;
                }
            }
        }

        for(int i = idx; i < 2000001; i ++){
            arr2[i] = point;
        }

        int cnt = 0;
        for(int i = 1; i <= idx; i++){
            if(arr1[i-1] != arr2[i-1] && arr1[i] == arr2[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}