import java.util.Scanner;
public class Main {
    static int max = 0;
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(cal(arr));
    }

    public static int cal(int[] arr){
        if(cnt == arr.length){
            return max;
        }

        if(arr[cnt] > max){
            max = arr[cnt];
        }
        cnt++;
        return cal(arr);
    }
}