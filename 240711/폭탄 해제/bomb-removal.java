import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Solution solution = new Solution(code, color, second);
        System.out.println("code : " + solution.code);
        System.out.println("color : " + solution.color);
        System.out.println("second : " + solution.second);
    }
}


class Solution{
    String code;
    String color;
    int second;

    public Solution(String code, String color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}