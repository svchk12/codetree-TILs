import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        
        int len = st.length();
        char c = st.charAt(0);
        
        String encoded = "";
        
        int cnt = 1;
        for(int i = 1; i < len; i++){
            if(st.charAt(i) == c){
                cnt++;
            }else{
                encoded += c;
                encoded += Integer.toString(cnt);
                c = st.charAt(i);
                cnt = 1;
            }
        }
        encoded += c;
        encoded += Integer.toString(cnt);

        System.out.println(encoded.length());
        System.out.println(encoded);
        
        
    }
}