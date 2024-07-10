import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        int n = 0;
        int len = A.length();
        
        for(int i = 0; i < len; i++){
            if(!A.equals(B)){
                String last = A.substring(len - 1, len);
                A = last + A.substring(0, len - 1);
                n++;
            }else{
                break;
            }

            if(n > len){
                n = -1;
                break;
            }
        }


        System.out.println(n);

    }
}