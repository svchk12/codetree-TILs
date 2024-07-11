import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();

        UserInfo userInfo = new UserInfo();
        System.out.println("user " + userInfo.id + " lv " + userInfo.level);

        UserInfo userInfo2 = new UserInfo(id, level);
        System.out.println("user " + userInfo2.id + " lv " + userInfo2.level);

    }
}

class UserInfo{

    String id;
    int level;

    public UserInfo(){
        this.id = "codetree";
        this.level = 10;
    }

    public UserInfo(String id, int level){
        this.id = id;
        this.level = level;
    }

};