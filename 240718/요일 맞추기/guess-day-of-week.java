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
        
        String[] name_of_days = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int date1 = totalDays(m1,d1);
        int date2 = totalDays(m2,d2);
        int diff = date2 - date1;

        if(diff < 0){
            diff = 0 - diff;
            System.out.println(name_of_days[diff % 7 -1]);
        }else if(diff == 0){
            System.out.println(name_of_days[1]);
        }else if(diff > 0){
            System.out.println(name_of_days[diff % 7]);
        }
        
        
        
    }

    public static int totalDays(int m, int d){
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;

        for(int i = 1; i < m; i++){
            days += num_of_days[i];
        }
        days += d;
        return days;
    }
}