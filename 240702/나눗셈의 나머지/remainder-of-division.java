import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cntArr = new int[10];
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        while(true){
            if(a/b > 0){
                cntArr[a%b]++;
                a = a / b;
            }else{
                cntArr[a%b]++;
                break;
            }
        }

        for(int i = 0; i < 10; i++){
            //System.out.println(cntArr[i]);
            sum = sum + (cntArr[i] * cntArr[i]);
        }

        System.out.println(sum);

    }
}