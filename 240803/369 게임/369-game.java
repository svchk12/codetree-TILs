import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <=n; i++){
            if(i % 3 == 0){
                System.out.print("0 ");
            }else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
                System.out.print("0 ");
            }else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9){
                System.out.print("0 ");
            }else{
                System.out.print(i + " ");
            }
            //{
                //3,6,9가 들어가는 경우
                // String istr = Integer.toString(i);
                // if(istr.contains("3")){
                //     System.out.print("0 ");
                // }
                // else if(istr.contains("6")){
                //     System.out.print("0 ");
                // }
                // else if(istr.contains("9")){
                //     System.out.print("0 ");
                // }else{
                //     System.out.print(i + " ");
                // }
                
            //}
        }
    }
}