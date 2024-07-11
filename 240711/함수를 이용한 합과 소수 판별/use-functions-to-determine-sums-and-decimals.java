import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = cal(a, b);
        System.out.print(cnt);
    }


    public static int cal(int a, int b){
        int result = 0;
        for(int i = a; i <= b; i++){
            int cnt = 0;
            for(int j = 1; j <= i; j ++){
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt == 2){
                int num = i;
                String numStr = Integer.toString(num);
                char [] arr = numStr.toCharArray();
                
                int sum = 0;
                for(int k = 0; k < arr.length; k++){
                    sum = sum + Character.getNumericValue(arr[k]);
                }
                if(sum % 2 == 0){
                        result++;
                }
            }
        }
        return result;
    }
}