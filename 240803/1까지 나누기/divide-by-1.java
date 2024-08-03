import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        
        for(int i = 1; i < 100; i++){
            if(n <= 1){
                System.out.println(cnt);
                break;
            }
            n = n / i;
            cnt++;
        }
    }
}