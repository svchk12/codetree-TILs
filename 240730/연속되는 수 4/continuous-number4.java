import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        int max = 0;
        int answer = 0;
        for(int i = 0; i < numbers.length; i++){
          if(i >= 1 && (numbers[i] > numbers[i - 1])) { // 부호가 같은 경우
                max++;
            }
            else {  // 부호가 다른 경우
                max = 1;
            }
            answer = Math.max(answer, max);    // 최장 길이 갱신
        }

        System.out.println(answer);
    }
}