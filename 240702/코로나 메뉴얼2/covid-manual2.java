import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] isCold = new String[3];
        int[] temp = new int[3];
        int[] cntArr = new int[4];
        boolean situation = false;

        for(int i = 0; i < 3; i++){
            isCold[i] = sc.next();
            temp[i] = sc.nextInt();
            if(isCold[i].equals("Y") && temp[i] >=37){
             cntArr[0]++;   
            }
            if(isCold[i].equals("N") && temp[i] >=37){
             cntArr[1]++;   
            }
            if(isCold[i].equals("Y") && temp[i] < 37){
             cntArr[2]++;   
            }
            if(isCold[i].equals("N") && temp[i] < 37){
             cntArr[3]++;   
            }
        }

        for(int i = 0; i < 4; i++){
            System.out.print(cntArr[i] + " ");
            if(cntArr[0]>=2){
                situation = true;
            }
        }

        if(situation){
            System.out.print("E");
        }

        
        
    }
}