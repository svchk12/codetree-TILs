import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();
        
        int index = st1.indexOf(st2);
        if(index > -1){
            System.out.println(index);
        }else{
            System.out.println("No");
        }

        
        
    }
}