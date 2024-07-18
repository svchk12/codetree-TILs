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
        String A = sc.next();
        
        String[] name_of_days = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat","Sun"};

        int date1 = totalDays(m1,d1);
        int date2 = totalDays(m2,d2);
        int diff = date2 - date1;
        //int dateIdx = diff % 7;

        //if(dateIdx =)
        System.out.println(diff % 7);
        //System.out.println(name_of_days[diff % 7]);
        
        
    }

    public static int totalDays(int m, int d){
        int[] num_of_days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;

        for(int i = 1; i < m; i++){
            days += num_of_days[i];
        }
        days += d;
        return days;
    }
}