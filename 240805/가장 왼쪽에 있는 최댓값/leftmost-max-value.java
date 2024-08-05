import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int prevMaxIdx = n;
        while(true){
            int maxIdx = 0;

            for(int i = 1; i < prevMaxIdx; i++){
                if(arr[i] > arr[maxIdx]){
                    maxIdx = i;
                }
            }

            System.out.print(maxIdx+1 + " ");

            if(maxIdx == 0){
                break;
            }

            prevMaxIdx = maxIdx;
        }






        // int prevMaxIdx = n;

        // while(true){
        //     int maxIdx = 0;

        //     for(int i = 1; i < prevMaxIdx; i++){
        //         if(arr[i] > arr[maxIdx]){
        //             maxIdx = i;
        //         }
        //     }
        //     System.out.print((maxIdx + 1) + " ");

        //     if(maxIdx == 0){
        //         break;
        //     }
        //     prevMaxIdx = maxIdx;
        // }
        
        
    }
}