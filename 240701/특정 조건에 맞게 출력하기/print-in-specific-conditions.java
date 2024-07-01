import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[100];

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                for(int j = 0; j <= i - 1; j++){
                    if(arr[j] % 2 != 0 ){
                        System.out.print(arr[j] + 3 +  " ");
                    }else{
                        System.out.print(arr[j] / 2 +  " ");
                    }
                    
                }
                break;
            }
        }



    }
}