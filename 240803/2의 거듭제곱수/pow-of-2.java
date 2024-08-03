import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        int x = 0;

        while(true){
            if(n == prod){
                break;
            }else{
                prod= prod * 2;
                x++;
            }
        }
        System.out.println(x);
    }
}