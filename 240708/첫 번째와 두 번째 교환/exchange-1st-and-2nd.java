import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        char [] arr = str1.toCharArray();

        char arr0 = arr[0];
        char arr0Temp = arr0;
        char arr1 = arr[1];
        char arr1Temp = arr1;

        for(int i = 0; i < str1.length(); i ++){
            if(arr[i] == arr0Temp){
                arr[i] = arr1Temp;
                continue;
            }
            else if(arr[i] == arr1Temp){
                arr[i] = arr0Temp;
                continue;
            }
        }

        System.out.print(String.valueOf(arr));

    }
}