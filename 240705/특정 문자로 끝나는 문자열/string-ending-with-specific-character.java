import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[10];
        int [] result = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.next();
        }

        String s = sc.next();
        char c = s.charAt(0);
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int len = arr[i].length();
            char cc = arr[i].charAt(len-1);
            if(c == cc){
                result[i] = 1;
                cnt++;
            }
        }

        for(int i = 0; i < 10; i++){
            if(result[i] == 1){
                System.out.println(arr[i]);
            }
        }

        if(cnt == 0) {
            System.out.println("None");   
        }
    }
}