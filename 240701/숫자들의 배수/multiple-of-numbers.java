import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int i = 1;

        while(cnt < 2){
            System.out.print(n * i + " ");
            if((n*i) % 5 == 0){
                cnt++;
            }
            i++;
        }

    }
}