import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;

        for(int i = 0; i < n; i++){
            int r = sc.nextInt();
            sum = sum + r;
        }

        String strSum = Integer.toString(sum);
        int len = strSum.length();
        String first = strSum.substring(0,1);
        strSum = strSum.substring(1, len);
        strSum = strSum + first;
        System.out.println(strSum);

    }
}