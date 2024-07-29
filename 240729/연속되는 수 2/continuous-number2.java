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

        int cnt = 0;
        int currrentIdx = 0;
        int [] groups = new int[n];
        for(int i =0; i < numbers.length; i++){
            if(i == 0){
                groups[currrentIdx]++;
            }else{
                if(numbers[i] == numbers[i-1]){
                    groups[currrentIdx]++;
                }else{
                    currrentIdx++;
                    groups[currrentIdx]++;
                }
            }
        }

        int max = Arrays.stream(groups).max().getAsInt();
        System.out.println(max);
        
    }
}