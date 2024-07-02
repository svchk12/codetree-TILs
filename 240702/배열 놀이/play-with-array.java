import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        int q = sc.nextInt();

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < q; i++){
            int qType = sc.nextInt();

            if(qType == 1){
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            }

            else if(qType == 2){
                int b = sc.nextInt();
                int idx = -1;
                for(int j = 0; j < n; j++){
                    if(arr[j] == b){
                        idx = j;
                        break;
                    }
                }
                System.out.println(idx + 1);
            }

            else{
                int s = sc.nextInt();
                int e = sc.nextInt();
                for(int j = s -1; j < e; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}