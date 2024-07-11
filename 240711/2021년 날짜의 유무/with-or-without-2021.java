import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        boolean answer = cal(M,D);
        if(answer){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean cal(int m, int d){
        if(m == 2 && d > 28){
            return false;
        }

        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            if(d > 31){
                return false;
            }
        }

        else{
            if(d > 30){
                return false;
            }
        }
        return true;
    }
}