import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = A+B;
        String strSum = Integer.toString(sum);
        char[] arr = strSum.toCharArray();
        int cnt = 0;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] == '1')
            cnt++;
        }
        System.out.println(cnt);
    }
}