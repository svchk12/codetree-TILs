import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(int k = n -1 ; k >= 1 ; k--){
            for(int l = k; l >= 1; l--){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
}