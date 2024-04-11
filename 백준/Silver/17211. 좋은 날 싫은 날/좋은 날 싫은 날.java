import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int x = Integer.parseInt(st.nextToken());
        int now = Integer.parseInt(st.nextToken());
        String[] z = br.readLine().split(" ");
        double good = 0.0;
        double bad = 0.0;
        if(now==0){
            good = 1.0;
        }else{
            bad = 1.0;
        }
        for (int i = 0; i < x; i++) {
            double nextGood = Double.parseDouble(z[0]) * good + Double.parseDouble(z[2]) * bad;
            double nextBad = Double.parseDouble(z[1]) * good + Double.parseDouble(z[3]) * bad;

            good = nextGood;
            bad = nextBad;
        }
        sb.append((int) Math.round(good * 1000)).append("\n").append((int) Math.round(bad * 1000));
        System.out.println(sb);
    }
}