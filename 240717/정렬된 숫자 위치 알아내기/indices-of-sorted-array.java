import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Numbers[] numbers = new Numbers[n];

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            numbers[i] = new Numbers(num, i+1);
        }

        Arrays.sort(numbers);

        for(int i = 0; i < n; i++){
            numbers[i].changedIdx = i+1;
        }

        Arrays.sort(numbers, new Comparator<Numbers>(){
            @Override
            public int compare(Numbers a, Numbers b){
                return a.originIdx - b.originIdx;
            }
        });

        for(int i = 0; i < n; i++){
            System.out.print(numbers[i].changedIdx + " ");
        }
        
    }
}

class Numbers implements Comparable<Numbers>{

    int num;
    int originIdx;
    int changedIdx;

    public Numbers(int num, int originIdx){
        this.num = num;
        this.originIdx = originIdx;
    }

    @Override
    public int compareTo(Numbers numbers){
        return this.num - numbers.num;
    }
}