import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 'A'; //65
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)x);
                x++;
                if(x >= 91){
                    x = 65;
                }
            }
            System.out.println();
        }
    }
}