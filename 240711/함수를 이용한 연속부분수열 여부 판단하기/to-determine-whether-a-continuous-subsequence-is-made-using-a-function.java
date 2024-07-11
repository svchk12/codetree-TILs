import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        boolean answer = cal(arr1, arr2);
        if(answer){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean cal(int[] arr1, int[] arr2){
        String str1 = "";
        String str2 = "";

        for(int i = 0; i < arr1.length;i++){
            str1 += arr1[i];
        }

        for(int i = 0; i < arr2.length;i++){
            str2 += arr2[i];
        }

        return str1.contains(str2);

    }
}