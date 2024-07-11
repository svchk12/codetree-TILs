import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();
        int result = 0;

        if(o.equals("+")){
            result = sum(a,c);
        }
        else if(o.equals("-")){
            result = minus(a,c);
        }
        else if(o.equals("*")){
            result = multiple(a,c);
        }
        else if(o.equals("/")){
            result = divide(a,c);
        }

        System.out.println(a + " " + o + " " + c + " = " + result);
    }

    public static int sum(int a, int c){
        return a+c;
    }

    public static int minus(int a, int c){
        return a-c;
    }

    public static int multiple(int a, int c){
        return a*c;
    }

    public static int divide(int a, int c){
        return a/c;
    }
}