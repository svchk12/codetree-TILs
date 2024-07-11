import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        car(str);
    }

    public static void car(String str){
        String reverse = "";
        for(int i = str.length()-1 ; i >= 0; i--){
            reverse = reverse + String.valueOf(str.charAt(i));
        }

        if(reverse.equals(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}