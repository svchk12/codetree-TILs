import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        WeatherInfo[] weatherInfo = new WeatherInfo[n];
        for(int i = 0; i < n; i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();

            weatherInfo[i] = new WeatherInfo(date, day, weather);
        }

        int latest = 0;
        for(int i = 0; i < n; i++){
            if(weatherInfo[i].weather.equals("Rain")){
                latest = i;
                break;
            }
        }
        for(int i = latest; i < n; i++){
            if(weatherInfo[i].weather.equals("Rain")){
                if(Integer.parseInt(weatherInfo[i].date.replace("-","")) < Integer.parseInt(weatherInfo[latest].date.replace("-",""))){
                    latest = i;
                }
            }
        }
        
        System.out.println(weatherInfo[latest].date + " " + weatherInfo[latest].day + " " + weatherInfo[latest].weather);

        
    }
}


class WeatherInfo{
    String date;
    String day;
    String weather;

    public WeatherInfo(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}