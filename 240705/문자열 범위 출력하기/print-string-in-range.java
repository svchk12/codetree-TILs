import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int len = s1.length();

        for(int i = 2; i <= 9; i++){
            System.out.print(s1.charAt(i));
        }

    }
}