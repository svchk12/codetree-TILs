import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        while(str1.indexOf(str2) > -1){
            String strRpl = str1.replace(str2,"");
            str1 = strRpl;
        }
        System.out.println(str1);
    }
}