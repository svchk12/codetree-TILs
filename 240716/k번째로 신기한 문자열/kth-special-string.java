import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        int cnt = 1;

        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            String str = sc.next();
            if(str.contains(T)){
                arr[i] = str;
            }else{
                arr[i] = "";
            }
        }

        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(!arr[i].equals("")){
                cnt++;
            }
            if(cnt == k){
                System.out.println(arr[i+1]);
                break;
            }
        }
    }
}