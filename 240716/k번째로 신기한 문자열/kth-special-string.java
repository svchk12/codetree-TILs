import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        int cnt = 0;

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
            //System.out.println(arr[i]);
            if(arr[i].equals("")){
                cnt++;
            }
            else{
                System.out.println(arr[i+cnt+1]);
                break;
            }
        }
    }
}