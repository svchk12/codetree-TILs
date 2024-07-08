import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i ++){
            int typ = sc.nextInt();
            if(typ == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                char [] arr = s.toCharArray();

                char tempA = arr[a-1];
                char tempB = arr[b-1];
                arr[a-1] = tempB;
                arr[b-1] = tempA;
                System.out.println(String.valueOf(arr));
                s = String.valueOf(arr);
            }

            if(typ == 2){
                String a = sc.next();
                String b = sc.next();
                String StrRpl = s.replace(a, b);
                System.out.println(StrRpl);
            }
        }

        

    }
}