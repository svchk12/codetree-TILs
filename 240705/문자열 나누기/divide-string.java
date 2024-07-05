import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        String st = "";

        for(int i = 0; i < n; i++){
            st = st + Integer.toString(arr[i]);
        }

        for(int i = 0; i < st.length(); i++){
            System.out.print(st.charAt(i));
            if(i % 5 == 4){
                System.out.println();
            }
        }

        

    }
}