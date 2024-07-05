import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        int [] arr = new int[]{len1 ,len2,len3};
        

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < 3; i++){
            
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println(max-min);
        
    }
}