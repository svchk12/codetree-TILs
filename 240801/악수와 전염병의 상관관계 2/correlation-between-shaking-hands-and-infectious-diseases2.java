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

        int[] shakeNum = new int [N+1];
        boolean[] infected = new boolean[N+1];
        Situation[] situation = new Situation[250];

        for(int i = 0; i < T; i++){
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            situation[i] = new Situation(t, x, y);
        }

        Arrays.sort(situation, 0, T);

        // for(int i = 0; i < 108; i++){
        //     System.out.println(i + "초 : " + situation[i].x + " / " + situation[i].y);
        // }

        for(int i = 0; i < T; i++ ){
            int target1 = situation[i].x;
            int target2 = situation[i].y;

            if(infected[target1]){
                shakeNum[target1]++;
            }
            if(infected[target2]){
                shakeNum[target2]++;
            }

            if(shakeNum[target1] <= K && infected[target1]){
                infected[target2] = true;
            }
            if(shakeNum[target2] <= K && infected[target2]){
                infected[target1] = true;
            }
        }

        for(int i = 1; i <= N; i++){
            if(infected[i]){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
        }
    }
}

class Situation implements Comparable<Situation>{
    int time;
    int x;
    int y;

    public Situation(int time, int x, int y){
        this.time = time;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Situation situation){
        return time - situation.time;
    }
};