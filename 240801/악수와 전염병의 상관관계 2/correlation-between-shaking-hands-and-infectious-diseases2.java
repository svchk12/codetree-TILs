import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();

        int[] isP = new int [N+1];
        Situation[] situation = new Situation[251];

        for(int i = 0; i < 251; i++){
            situation[i] = new Situation();
        }

        for(int i = 0; i < T; i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            situation[t] = new Situation(x, y);
        }

        // for(int i = 0; i < 108; i++){
        //     System.out.println(i + "초 : " + situation[i].x + " / " + situation[i].y);
        // }

        int cnt = 0;
        for(int i = 0; i < 251; i++){
            if(situation[i].x > 0){
                // 최초 감염자인지 체크
                if(situation[i].x == P || situation[i].y ==P){
                    isP[situation[i].x] = 1;
                    isP[situation[i].y] = 1;
                }
                
                //앞서서 감염됬는지 체크
                for(int j = 0; j <= i; j ++){
                    if(isP[situation[i].x] == 1 || isP[situation[i].y] ==1){
                        isP[situation[j].x] = 1;
                        isP[situation[j].y] = 1;
                    }
                }
                cnt++;
            }
            if(cnt == K){
                break;
            }
        }

        for(int i = 1; i < isP.length ; i++){
            System.out.print(isP[i]);
        }
    }
}

class Situation{
    int x = 0;
    int y = 0;

    public Situation(){
        this.x = x;
        this.y = y;
    }

    public Situation(int x, int y){
        this.x = x;
        this.y = y;
    }
}