import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        

        UserInfo[] userInfo = new UserInfo[n];
        for(int i = 0; i < n; i++){
            String userNm = sc.next();
            String add = sc.next();
            String location = sc.next();

            userInfo[i] = new UserInfo(userNm, add, location);
        }

        int descIdx = 0;        
        for(int i = 0; i < n; i++){
            if(userInfo[i].userNm.charAt(0) > userInfo[descIdx].userNm.charAt(0)){
                descIdx = i;
            }
        }

        System.out.println("name " + userInfo[descIdx].userNm);
        System.out.println("addr " + userInfo[descIdx].add);
        System.out.println("city " + userInfo[descIdx].location);
    }
}

class UserInfo{
    String userNm;
    String add;
    String location;

    public UserInfo(String userNm, String add, String location){
        this.userNm = userNm;
        this.add = add;
        this.location = location;
    }
}