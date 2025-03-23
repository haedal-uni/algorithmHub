import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split(" : ");
        int hour = Integer.parseInt(x[0]);
        int minute = Integer.parseInt(x[1]);
        int second = Integer.parseInt(x[2]);
        x = br.readLine().split(" : ");
        hour = Integer.parseInt(x[0])-hour;
        minute = Integer.parseInt(x[1])-minute;
        second = Integer.parseInt(x[2])-second;
        if(second<0){
            minute-=1;
            second+=60;
        }if(minute<0){
            hour-=1;
            minute+=60;
        }
        if(hour<0){
            hour+=24;
        }
        System.out.print(second+minute*60+hour*3600);
    }
}