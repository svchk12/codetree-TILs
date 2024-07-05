import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String st = sc.next();
        int n = sc.nextInt();

        int len = st.length();

        for(int i = len-1; i > len - n-1; i--){
            System.out.print(st.charAt(i));
        }
        
    }
}