import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(br.readLine());
        if(d/3600>0){
            hour+=d/3600;
            d=d%3600;
        }if(d/60>0){
            min+=d/60;
            d=d%60;
        }
        sec+=d;
        if(sec>59){
            min+=sec/60;
            sec=sec%60;
        }
        if(min>59){
            hour+=min/60;
            min=min%60;
        }
        if(hour>23){
            hour%=24;
        }
        System.out.println(hour+" "+min+" "+sec);
    }
}