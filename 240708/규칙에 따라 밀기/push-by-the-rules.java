import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String command = sc.next();
        
        char[] arr = command.toCharArray();
        int len = str.length();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'L'){
                String first = str.substring(0, 1);
                str = str.substring(1, len) + first; 
            }else{
                String last = str.substring(len -1, len);
                str = last + str.substring(0,len-1);     
            }
        }

        System.out.println(str);

    }
}