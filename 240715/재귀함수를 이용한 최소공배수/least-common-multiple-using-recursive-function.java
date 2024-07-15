import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(cal(arr));
    }

    public static int cal(int[] arr){
        int answer = 0;

        if(arr.length == 1){
            return arr[0];
        }
        
        int g = gcd(arr[0], arr[1]);
        answer = (arr[0] * arr[1]) / g;

        if(arr.length > 2) { 
            for(int i = 2; i < arr.length; i++) {
                g = gcd(answer, arr[i]);
                answer = (answer * arr[i]) / g;
            }
        }
        return answer;
    }


    public static int gcd(int a , int b){
	    if (b == 0){
            return a;
        } 
	    return gcd(b, a%b);
 }
}