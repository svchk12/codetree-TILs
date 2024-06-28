import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 'A';
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i > j){
                    System.out.print("  ");    
                }else{
                    System.out.print((char)x + " ");
                    x++;
                    if(x >= 91){
                    x = 65;
                }
                }
            }
            System.out.println();
        }
    }
}