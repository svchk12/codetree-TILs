import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        desc(n);
        asc(temp);

    }

    public static void desc(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        desc(n-1);
    }

    public static void asc(int n){
        if(n == 0){
            return;
        }
        asc(n-1);
        System.out.print(n + " ");
    }
}