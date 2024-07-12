import java.util.Scanner;
public class Main {
    public static int start = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        print(n);
        System.out.println();
        printReverse(n);
    }

    public static void print(int n){
        if(start > n){
            return;
        }
        
        System.out.print(start + " ");
        start++;
        print(n);
        
    }

    public static void printReverse(int n){
        if(n < 1){
            return;
        }
        
        System.out.print(n + " ");
        printReverse(n-1);
        
    }
}