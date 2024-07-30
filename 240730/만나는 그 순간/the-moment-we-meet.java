import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] arr1 = new int[1000000];
        int [] arr2 = new int[1000000];
        int point = 0;
        int sum = 0;
        int idx = 0;
        for(int i = 0; i < n; i++){
            String d = sc.next();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++){
                if(d.equals("R")){
                    point++;
                    arr1[++idx] = point;
                }else if(d.equals("L")){
                    point--;
                    arr1[++idx] = point;
                }
            }
        }

        point = 0;
        sum = 0;
        idx = 0;
        for(int i = 0; i < m; i++){
            String d = sc.next();
            int t = sc.nextInt();
            for(int j = 0; j < t; j++){
                if(d.equals("R")){
                    point++;
                    arr2[++idx] = point;
                    
                }else if(d.equals("L")){
                    point--;
                    arr2[++idx] = point;
                }
            }
        }

        
        for(int i = 1; i <= idx; i++){
            if(arr1[i] == arr2[i]){
                System.out.println(i);
                return;
            }
        }

        System.out.println("-1");

    }
}