import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        car(a,b);

    }

    public static void car(int a, int b){
        if(a < b){
            a = a + 10;
            b = b * 2;
        }else{
            a = a * 2;
            b = b + 10;
        }

        System.out.println(a + " " + b);
    }
}