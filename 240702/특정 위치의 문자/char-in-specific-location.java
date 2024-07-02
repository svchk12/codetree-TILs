import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"L","E","B","R","O","S"};
        boolean isExsist = false;

        String s = sc.next();
        for(int i = 0; i < 6; i++){
            if(s.equals(arr[i])){
                System.out.println(i);
                isExsist = true;
                break;
            }
        }

        if(!isExsist){
            System.out.println("None");
        }
    }
}