import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        cal(a,b,c);
    }

    public static void cal(int a, int b, int c){
        int min = a;

        if(a < b && a < c){
            min = a;
        }
        else if(b < a && b < c){
            min = b;
        }
        else if(c < a && c < b){
            min = c;
        }

        System.out.println(min);
    }
}