import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int [] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        int max = 0;
        int answer = 0;
        for(int i = 0; i < numbers.length; i++){
          if(i >= 1 && (numbers[i] > t)) {
                max++;
            }
            else {
                max = numbers[i] > t ? 1 : 0;
            }
            answer = Math.max(answer, max);
        }

        System.out.println(answer);
    }
}