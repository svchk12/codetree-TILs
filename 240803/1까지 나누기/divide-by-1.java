import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 1;
        
        for(int i = 1; i < 100; i++){
            if(i  == 1){
                r = n / i;
            }
            else{
                r = r / i;
                if(r <= 1){
                    System.out.println(i);
                    break;
                }
            }
            
        }
    }
}