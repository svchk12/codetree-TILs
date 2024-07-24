import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ColorVo[] colorVo = new ColorVo[200001];
        int start = 100000;

        for(int i = 0; i < 200001; i++){
            colorVo[i] = new ColorVo();
        }

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            String command = sc.next();

            if(command.equals("R")){
                for(int j = 0; j < x; j++){
                    colorVo[start].blackUp();
                    if(j < x -1){
                        start++;
                    }
                }
            }else{
                for(int j = 0; j < x; j++){
                    colorVo[start].whiteUp();
                    if(j < x -1){
                        start--;
                    }
                }
            }
        }

        int grayCount = 0;
        int whiteCount = 0;
        int blackCount = 0;

        for(int i = 0; i < 200001; i++){
            if(colorVo[i].status.equals("Gray")){
                grayCount++;
            }
            if(colorVo[i].status.equals("White")){
                whiteCount++;
            }
            if(colorVo[i].status.equals("Black")){
                blackCount++;
            }
        }
         System.out.print(whiteCount + " " + blackCount + " " + grayCount);
    }
}

class ColorVo{
    String status;
    int whiteCount;
    int blackCount;

    public ColorVo(){
        this.status="";
        this.whiteCount = 0;
        this.blackCount = 0;
    }

    public void whiteUp(){
        status = "White";
        whiteCount++;
        if(whiteCount >=2 && blackCount >=2){
            status = "Gray";
        }
    }

    public void blackUp(){
        status = "Black";
        blackCount++;
        if(whiteCount >=2 && blackCount >=2){
            status = "Gray";
        }
    }

}