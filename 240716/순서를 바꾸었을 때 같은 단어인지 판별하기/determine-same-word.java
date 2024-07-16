import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        boolean flag = true;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length){
            flag = false
        }
        else if(arr1.length == arr2.length){
            for(int i = 0; i < arr2.length; i++){
                if(arr1[i] != arr2[i]){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}