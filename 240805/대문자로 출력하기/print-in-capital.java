import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char[] arrResult = new char[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 'A' && arr[i] <= 'Z')
            System.out.print(Character.toUpperCase(arr[i]));

            if(arr[i] >= 'a' && arr[i] <= 'z')
            System.out.print(Character.toUpperCase(arr[i]));
        }

        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] >= 'A' && arr[i] <= 'Z'){
        //         arrResult[i] = arr[i];
        //     }
        //     if(arr[i] >= 'a' && arr[i] <= 'z'){
        //         arrResult[i] = (char)(arr[i] - 'a' + 'A');
        //     }
        // }

        // for(int i = 0; i < arrResult.length; i ++){
        //     if((int)arrResult[i] != 0){
        //         System.out.print(arrResult[i]);
        //     }
        // }
        
    }
}