import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int len = st.length();

        char[] arr = new char[len];
        
        for(int i = 0; i < len; i++){
            if(i % 2 !=0){
                arr[i] = st.charAt(i);
            }
        }

        for(int i = len -1; i >= 0;i --){
            if(i % 2 != 0)
            System.out.print(arr[i]);
        }
        
    }
}