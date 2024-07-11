import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreBoard[] scoreBoard = new ScoreBoard[5];
        for(int i = 0; i < 5; i++){
            String codeNm = sc.next();
            int score = sc.nextInt();
            scoreBoard[i] = new ScoreBoard(codeNm, score);
        }

        int minIdx = 0;
        int min = scoreBoard[0].score;
        for(int i = 0; i < 5; i++){
            if(scoreBoard[i].score < min){
                minIdx = i;
            }
        }
        System.out.println(scoreBoard[minIdx].codeNm + " " + scoreBoard[minIdx].score);

    }
}



class ScoreBoard{
    String codeNm;
    int score;

    public ScoreBoard(String codeNm, int score){
        this.codeNm = codeNm;
        this.score = score;
    }
}