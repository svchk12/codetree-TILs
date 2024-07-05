import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.next();
        char schar = s2.charAt(0);
        
        int len = s1.length();
        int cnt = 0;

        for(int i = 0; i < len; i++){
            if(s1.charAt(i) == schar){
                cnt++;
            }
        }

        System.out.println(cnt);

        
    }
}