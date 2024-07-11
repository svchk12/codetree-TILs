import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        int month = cal(Y,M,D);

        if(month >= 3 && month <=5){
            System.out.println("Spring");
        }
        if(month >= 6 && month <=8){
            System.out.println("Summer");
        }
        if(month >= 9 && month <=11){
            System.out.println("Fall");
        }
        if(month >= 12 && month <=14){
            System.out.println("Winter");
        }
        if(month == -1){
            System.out.println("-1");
        }
    }

    public static int cal(int y, int m, int d){
        //윤년인 경우
        if(isY(y)){
            if(m == 2 && d <= 29){
                m = m + 12;
            }else{
                m = -1;
            }

            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                if(d <= 31){
                    if(m == 1){
                        m = m + 12;
                    }
                }else{
                    m = -1;
                }
            }
            else if(m == 4 || m == 6 || m == 9 || m == 11){
                if(d <= 30){
                    m = m;
                }else{
                    m = -1;
                }
            }           
        //윤년이 아닌경우    
        }else{
            System.out.print("is Not Y");
             if(m == 2 && d <= 28){
                m = m + 12;
            }else{
                m = -1;
            }

            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                if(d <= 31){
                    if(m == 1){
                        m = m + 12;
                    }
                }else{
                    m = -1;
                }
            }
            else if(m == 4 || m == 6 || m == 9 || m == 11){
                if(d <= 30){
                    m = m;
                }else{
                    m = -1;
                }
            }  
        }
        return m;
    }

    public static boolean isY(int y){
        if(y % 4 == 0){
            if(y % 4 == 0 && y % 100 == 0 ){
                return false;
            }else if(y % 4 == 0 && (y % 100 == 0 || y % 400 == 0)){
                return true;
            }
            return true;
        }else{
            return false;
        }
    }
}