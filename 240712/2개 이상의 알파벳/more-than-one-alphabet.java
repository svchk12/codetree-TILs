import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        car(str);
    }

    public static void car(String str){
        char[] arr = str.toCharArray();
        int cnt = 1;
        char compare = arr[0];
        for(int i = 1; i <= arr.length-1; i++){
            if(arr[i-1] != arr[i]){
                cnt++;
            }
        }

        if(cnt >= 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}