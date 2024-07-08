import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char c = a.charAt(0);
        int next = (int)c + 1;
        if(next >= 128){
            next = 97;
        }
        
        System.out.print((char)next);
    }
}