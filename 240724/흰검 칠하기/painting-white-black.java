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
                    //colorVo[start] = new ColorVo("Black", 0, 1);
                    colorVo[start].blackUp();
                    if(j < x -1){
                        start++;
                    }
                }
            }else{
                for(int j = 0; j < x; j++){
                    //colorVo[start] = new ColorVo("White", 1, 0);
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
        // System.out.println(colorVo[99999].whiteCount + " " + colorVo[99999].blackCount + " " + colorVo[99999].status);
        // System.out.println(colorVo[100000].whiteCount + " " + colorVo[100000].blackCount + " " + colorVo[100000].status);
        // System.out.println(colorVo[100001].whiteCount + " " + colorVo[100001].blackCount + " " + colorVo[100001].status);
        // System.out.println(colorVo[100002].whiteCount + " " + colorVo[100002].blackCount + " " + colorVo[100002].status);
        // System.out.println(colorVo[100003].whiteCount + " " + colorVo[100003].blackCount + " " + colorVo[100003].status);
        // System.out.println(colorVo[100004].whiteCount + " " + colorVo[100004].blackCount + " " + colorVo[100004].status);
        // System.out.println(colorVo[100005].whiteCount + " " + colorVo[100005].blackCount + " " + colorVo[100005].status);
        // System.out.println(colorVo[100006].whiteCount + " " + colorVo[100006].blackCount + " " + colorVo[100006].status);
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


    // public ColorVo(String status, int whiteCount, int blackCount){
    //     if(this.whiteCount + whiteCount >=2 && this.blackCount >=2){
    //         this.status = "Gray";
    //     }else if(this.whiteCount >=2 && this.blackCount + blackCount >=2)
    //         this.status = "Gray";
    //     else{
    //         this.status = status;
    //     }
    //     this.whiteCount = this.whiteCount++;
    //     this.blackCount = this.blackCount++;
    // }
}