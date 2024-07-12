import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        printReverse(n);
    }

    public static void print(int n){
        if(n == 0){
            return;
        }
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
        print(n-1);
        
    }

    public static void printReverse(int n){
        if(n == 0){
            return;
        }
        printReverse(n-1);
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
        
        
    }
}