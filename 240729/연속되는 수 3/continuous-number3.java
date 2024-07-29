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

        int plus = 0;
        int minus = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0){
                minus++;
            }else{
                plus++;
            }
        }

        if(plus > minus){
            System.out.println(plus);
        }else{
            System.out.println(minus);
        }
    }
}