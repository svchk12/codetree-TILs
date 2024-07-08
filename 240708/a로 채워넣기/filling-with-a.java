import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();

        for(int i = 0; i < str.length()-1; i ++){
            arr[i] = str.charAt(i);
        }


        arr[1] = 'a';
        arr[str.length() - 2] = 'a';

        System.out.println(String.valueOf(arr));

    }
}