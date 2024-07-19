import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int num = changeTen(binary);
        changeTwo(num);
    }

    public static int changeTen(String binary){
        int num = 0;
        for(int i = 0; i < binary.length(); i++){
            num = num * 2 + (binary.charAt(i)-'0');
        }
        return num * 17;
    }


    public static void changeTwo(int num){
        int[] arr = new int[20];
        int cnt = 0;

        while(true){
            if(num < 2){
                arr[cnt++] = num;
                break;
            }else{
                arr[cnt++] = num % 2;
                num = num / 2;
            }
        }
        for(int i = cnt-1; i >=0; i--){
            System.out.print(arr[i]);
        }
    }


}