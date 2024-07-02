import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] arr = new int[100];
        int min = 0;
        int max = 0;



        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 999 || arr[i] == -999){
                break;
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= max && arr[i] != 999){
                max = arr[i];
            }else if(arr[i] <= min && arr[i] != -999){
                min = arr[i];
            }
        }

        System.out.printf("%d %d", max, min);

        


    }
}