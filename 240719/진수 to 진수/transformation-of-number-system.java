import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Integer n = sc.nextInt();
        String nStr = Integer.toString(n);

        int num = changeTen(nStr, a);
        changeB(num, b);    
    }

    public static int changeTen(String n, int a){
        int num = 0;
        for(int i = 0; i < n.length(); i++){
            num = num * a + (n.charAt(i) - '0');
        }
        return num;
    }

    public static void changeB(int num, int b){
        int[] arr = new int[20];
        int cnt = 0;

        while(true){
            if(num < b){
                arr[cnt++] = num;
                break;
            }else{
                arr[cnt++] = num % b;
                num = num / b;
            }
        }
        for(int i = cnt-1; i >=0; i--){
            System.out.print(arr[i]);
        }
    }


}