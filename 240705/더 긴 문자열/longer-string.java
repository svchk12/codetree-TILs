import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        int sl1 = s1.length();
        int sl2 = s2.length();

        if(sl1 > sl2){
            System.out.println(s1 + " " + sl1);
        }
        else if(sl1 < sl2){
            System.out.println(s2 + " " + sl2);
        }
        else{
            System.out.println("same");
        }
    }
}