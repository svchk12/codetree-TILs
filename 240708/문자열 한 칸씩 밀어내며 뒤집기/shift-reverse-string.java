import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        
        for(int i = 0; i < q; i++){
            int typ = sc.nextInt();

            if(typ == 1){
                String first = str.substring(0,1);
                str = str.substring(1, str.length()) + first;
                System.out.println(str);
            }

            if(typ == 2){
                String last = str.substring(str.length() - 1,str.length());
                str = last + str.substring(0, str.length()-1);
                System.out.println(str);
            }

            if(typ == 3){
                char[] arr = str.toCharArray();
                for(int j = arr.length -1; j >= 0; j--){
                    System.out.print(arr[j]);
                }
                System.out.println();
            }

        }
        
    }
}