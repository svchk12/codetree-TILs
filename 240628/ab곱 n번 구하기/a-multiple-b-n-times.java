import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        for(int i = 0; i < n; i++){
            int x = 1;
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a; j <=b; j++){
                x *= j;
            }
            System.out.println(x);
        }
    }
}