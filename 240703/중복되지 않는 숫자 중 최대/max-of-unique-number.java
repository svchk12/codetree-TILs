import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = -1;
        for(int i = 1; i < n; i++){
            int curNum = arr[i];
            if(curNum > max){
                int count = 0;
                for(int j = 0; j < n; j++){
                    if(arr[j] == arr[i]){
                        count++;
                    }
                }
                if(count == 1){
                    max = curNum;
                }
            }

        }
        System.out.print(max);
    }
}