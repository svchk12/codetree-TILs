import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strN = Integer.toString(n);
        
        int sum = 0;
        char [] arr = strN.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            sum = sum + Integer.parseInt(String.valueOf(arr[i]));
        }
        
        System.out.println(sum);
    }
}