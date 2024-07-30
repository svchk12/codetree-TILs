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

        for(int i = 0; i < n; i++){
            String d = sc.next();
            int t = sc.nextInt();
            for(int j = sum; j < sum + t; j++){
                if(d.equals("R")){
                    point = point + 1;
                    arr1[j] = point;
                    
                }else{
                    point = point -1 ;
                    arr1[j] = point;
                }
            }
            sum = sum + t;
        }

        point = 0;
        sum = 0;
        for(int i = 0; i < m; i++){
            String d = sc.next();
            int t = sc.nextInt();
            for(int j = sum; j < sum + t; j++){
                if(d.equals("R")){
                    point = point + 1;
                    arr2[j] = point;
                    
                }else{
                    point = point -1 ;
                    arr2[j] = point;
                }
            }
            sum = sum + t;
        }

        for(int i = 0; i < 1000000; i++){
            if(arr1[i] == arr2[i]){
                System.out.println(i+1);
                break;
            }
        }
    }
}