import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = compare(a, b);
        System.out.println(cnt);
    }

    public static int compare(int a, int b){
        int cnt = 0;
        for(int i = a; i <=b; i++){
            if(three(i)){
                cnt++;
                continue;
            }

            if(isThreeSixNine(i)){
                cnt++;
                continue;
            }
        }
        return cnt;
    }
        

    public static boolean three(int i){
        return i % 3 == 0;
    }

    public static boolean isThreeSixNine(int i){
        while(i > 0){
            if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
                return true;
            }
            i = i / 10;
        }
        return false;
    }
}