import java.util.Scanner;

class Output{
    String secretCode;
    String location;
    int time;

    public Output(String secretCode, String location, int time){
        this.secretCode = secretCode;
        this.location = location;
        this.time = time;
    }

};


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String secretCode = sc.next();
        String location = sc.next();
        int time = sc.nextInt();

        Output output = new Output(secretCode, location, time);

        System.out.println("secret code : " + output.secretCode);
        System.out.println("meeting point : " + output.location);
        System.out.println("time : " + output.time);
    }
}