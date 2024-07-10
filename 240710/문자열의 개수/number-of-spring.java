import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[200];
        int cnt = 0;
        
        for(int i = 0; i < arr.length;i++){
            String str = sc.next();
            if(str.equals("0")){
                break;
            }else{
                arr[i] = str;
                cnt++;
            }
        }
        System.out.println(cnt);
        for(int i = 0; i < arr.length;i++){
            if(i % 2 == 0 && arr[i] != null){
                System.out.println(arr[i]);
            }
        }
    }
}