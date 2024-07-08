import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int idx = str.indexOf("e");

        char [] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(i != idx){
                System.out.print(arr[i]);
            }
        }
        
    }
}