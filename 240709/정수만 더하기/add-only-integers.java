import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char[] arr = A.toCharArray();
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >='0' && arr[i] <='9'){
                int n = Integer.parseInt(String.valueOf(arr[i]));
                sum += n;
            }
        }
        System.out.println(sum);

    }
}