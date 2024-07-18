import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int date1 = 0;
        int date2 = 0;

        for(int i = 1; i <= m1; i++){
            if(i == m1){
                date1 = date1 + d1;  
            }else{
                date1 = date1 + num_of_days[i];
            }
        }

        for(int i = 1; i <= m2; i++){
            if(i == m2){
                date2 = date2 + d2;
            }else{
                date2 = date2 + num_of_days[i];
            }
        }
        System.out.println(date2 - date1 + 1);
    }
}