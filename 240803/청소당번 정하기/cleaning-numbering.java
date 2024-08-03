import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cntC = 0;
        int cntA = 0;
        int cntT = 0;

        for(int i = 1; i <=n; i++){
            if(i % 12 == 0){
                cntT++;
            }else if (i % 3 == 0){
                cntA++;
            }
            else if (i % 2 == 0){
                cntC++;
            }
        }
        System.out.printf("%d %d %d", cntC, cntA, cntT);
    }
}