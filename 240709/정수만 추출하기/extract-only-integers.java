import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        String first = "";
        String second = "";
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] >= '0' && arr1[i] <= '9'){
                first = first + String.valueOf((char)(arr1[i]));
            }else{
                break;
            }
        }

        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] >= '0' && arr2[i] <= '9'){
                second = second + String.valueOf((char)(arr2[i]));
            }else{
                break;
            }
        }
        System.out.println(Integer.parseInt(first) + Integer.parseInt(second));
        
    }
}