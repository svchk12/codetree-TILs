import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int date1 = 0;
        int date2 = 0;

        for(int i = 1; i <= 11; i++){
            if(i == 11){
                date1 = date1 + 11;  
            }else{
                date1 = date1 + num_of_days[i];
            }
        }

        for(int i = 1; i <= 11; i++){
            if(i == 11){
                date2 = date2 + a;
            }else{
                date2 = date2 + num_of_days[i];
            }
        }

        int totalMin1 = (date1 - 1) * 1440 + (60 * 11) + 11;
        int totalMin2 = (date2 - 1) * 1440 + (60 * b) + c;

        if(totalMin2 - totalMin1 >= 0){
            System.out.print(totalMin2 - totalMin1);
        }else{
            System.out.print("-1");
        }


    }
}