import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        int under = 1;
        int upper = 1000;

        for(int i = 0; i < 10; i++){
            if(arr[i] > under && arr[i] <500){
                under = arr[i];
            }

            if(arr[i] < upper && arr[i] > 500){
                upper = arr[i];
            }
        }

        System.out.println(under + " " + upper);
    }
}