import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(a + " ");
        while(a < b){
            if(a % 2 != 0){
                a *= 2;
                if(a <= b)
                System.out.print(a + " ");
            }else{
                a += 3;
                if(a <= b)
                System.out.print(a + " ");
            }
        }
    }
}