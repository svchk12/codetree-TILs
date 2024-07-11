import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = compare(a, b);
        System.out.println(cnt);
    }

    public static int compare(int a, int b){
        int cnt = 0;
        
        for(int i = a; i <=b; i++){
            if(three(i)){
                cnt++;
                continue;
            }

            String strI = Integer.toString(i);
            char[] arr = strI.toCharArray();
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == '3' || arr[j] == '6' || arr[j] == '9'){
                    cnt++;
                    break;
                }
            }

        }
        return cnt;
    }

    public static boolean three(int i){
        return i % 3 == 0;
    }
}