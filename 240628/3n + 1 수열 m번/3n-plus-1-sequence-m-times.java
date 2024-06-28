import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        

        for(int i = 0; i < m; i++){
            int cnt = 0;
            int n = sc.nextInt();
            
            while(n != 1){
                if(n %2 == 0){
                    n = n / 2;
                    cnt++;
                }else{
                    n = 3 * n + 1;
                    cnt++;
                }
                
            }
            System.out.println(cnt);
        }

        
        
    }
}