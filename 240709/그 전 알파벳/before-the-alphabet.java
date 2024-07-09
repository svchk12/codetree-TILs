import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = str.charAt(0);

        int prev = (int)c - 1;
        if(prev == 96){
            prev = 122;
        }
        System.out.println((char)prev);
        
    }
}