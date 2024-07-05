import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        String s = sc.next();
        char c = s.charAt(0);

        int cnt = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i].charAt(0) == c){
                cnt++;
                sum = sum + arr[i].length();
            }
        }

        System.out.printf("%d %.2f", cnt, (double)sum / cnt);
        
    }
}