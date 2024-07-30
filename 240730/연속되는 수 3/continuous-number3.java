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

        int [] countArr = new int[n];
        int curInx = 0;
        int pluseCnt = 0;
        int minusCnt = 0;
        boolean isPluse = true;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                pluseCnt++;
                countArr[curInx] = minusCnt;
                curInx++;               
            }else if(numbers[i] < 0){
                minusCnt++;
                countArr[curInx] = pluseCnt;
                curInx++;               
            }
        }

        if(countArr[0] == 0){
            if(pluseCnt > 0){
                countArr[0] = pluseCnt;
            }else if(minusCnt > 0){
                countArr[0] = minusCnt;
            }
        }

        int max = Arrays.stream(countArr).max().getAsInt();
        System.out.println(max);
    }
}