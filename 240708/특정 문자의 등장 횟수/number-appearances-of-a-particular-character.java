import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < str1.length() - 1; i++){
            if(str1.charAt(i) == 'e' && str1.charAt(i+1) == 'e'){
                cnt1++;
            }

            if(str1.charAt(i) == 'e' && str1.charAt(i+1) == 'b'){
                cnt2++;
            }
        }

        System.out.printf("%d %d", cnt1, cnt2);
        
    }
}