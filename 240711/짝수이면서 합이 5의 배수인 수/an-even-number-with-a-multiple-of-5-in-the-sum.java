import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(printer(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean printer(int n){
        if(n % 2 == 0){
            String nStr = Integer.toString(n);
            char[] arr = nStr.toCharArray();
            if((Character.getNumericValue(arr[0]) + Character.getNumericValue(arr[1])) % 5 == 0){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}