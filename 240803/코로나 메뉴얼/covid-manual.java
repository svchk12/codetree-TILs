import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        for(int i = 0; i < 3; i++){
            String status = sc.next();
            int temp = sc.nextInt();
            if(status.equals("Y") && temp >= 37){
                cnt++;
            }
        }

        if(cnt >= 2){
            System.out.println("E");
        }else{
            System.out.println("N");
        }
    }
}