import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String st = sc.next();
        int n = sc.nextInt();

        for(int i = st.length()-1; i >= st.length() - n; i--){
            if(st.length() - 1 >= st.length() - n){
                System.out.print(st.charAt(i));
            }else{
                break;
            }
            
        }
    }
}