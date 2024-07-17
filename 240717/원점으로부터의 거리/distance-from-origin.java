import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Spots[] spots = new Spots[n];

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            spots[i] = new Spots(x, y, i+1);
        }

        Arrays.sort(spots);

        for(int i = 0; i < n; i++){
            System.out.println(spots[i].idx);
        }

    }
}

class Spots implements Comparable<Spots> {
    int x;
    int y;
    int idx;

    public Spots(int x, int y, int idx){
        if(x < 0){
            this.x = 0 - x;
        }
        else{
            this.x = x;
        }

        if(y < 0){
            this.y = 0 - y;
        }
        else{
            this.y = y;
        }

        this.idx = idx;
    }

    @Override
    public int compareTo(Spots spots){
        if(spots.x + spots.y == this.x + this.y){
            return this.idx - spots.idx;
        }
        return (this.x + this.y) - (spots.x + spots.y);
    }
}