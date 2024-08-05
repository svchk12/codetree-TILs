import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int k = 1; k <=2; k++){
            for(int i = 1; i <=n; i ++){
                for(int j = 1; j <=n; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
    }
}