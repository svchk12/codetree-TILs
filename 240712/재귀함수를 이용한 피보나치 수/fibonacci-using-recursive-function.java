import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getIdx(n));
    }

    public static int getIdx(int n){

        if(n <= 2){
            return 1;
        }
        
        return getIdx(n-2) + getIdx(n-1);
    }
}