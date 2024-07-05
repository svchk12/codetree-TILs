import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        String s = sc.next();
        char c = s.charAt(0);

        int [] result = new int[5];
        int cnt = 0;

        for(int i = 0; i < 5; i++){
            if(arr[i].charAt(2) == c || arr[i].charAt(3) == c){
                result[i] = 1;
                cnt++;
            }
        }

        for(int i = 0; i < result.length; i++){
            if(result[i] == 1){
                System.out.println(arr[i]);
            }
        }
        System.out.println(cnt);
    }
}