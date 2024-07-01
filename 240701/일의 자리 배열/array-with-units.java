import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int [] arr = new int[10];

        arr[0] = a;
        arr[1] = b;

        for(int i = 2; i < 10; i++){
            int sum = 0;
            sum = arr[i-1] + arr[i-2];
            if(sum >= 10){
                arr[i] = sum % 10;
            }else{
                arr[i] = sum;
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }     

    }
}