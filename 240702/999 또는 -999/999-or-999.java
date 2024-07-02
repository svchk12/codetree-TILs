import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] arr = new int[100];
        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999){
                break;
            }
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 999 || arr[i] != -999){
                break;
            }
            
            if(arr[i] > max ){
                max = arr[i];
            }else if(arr[i] < min ){
                min = arr[i];
            }
        }

        System.out.printf("%d %d", max, min);

        


    }
}