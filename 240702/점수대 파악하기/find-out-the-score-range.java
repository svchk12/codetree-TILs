import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] cntArr = new int[10];

        for(int i = 0; i < 100; i++){
            arr[i] = sc.nextInt();
            if(arr[i]/10 >= 0){
                if(arr[i] > 0){
                    cntArr[arr[i]/10-1] ++;
                }else if(arr[i] >= 0){
                    break;
                }
            }
        }

        for(int i = 10; i >= 1; i --){
            System.out.println(i+"0" + " - " + cntArr[i-1]);
        }

    }
}