import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int year = -Integer.parseInt(st.nextToken());
        int month = -Integer.parseInt(st.nextToken());
        int day = -Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine()," ");
        year+=Integer.parseInt(st.nextToken());
        month+=Integer.parseInt(st.nextToken());
        day+=Integer.parseInt(st.nextToken());
        if(year>0 && month>0 || month>=0&&day>=0) {
            sb.append(year).append("\n");
        }else if(year>0){
            sb.append(year-1).append("\n");
        }else{
            sb.append("0").append("\n");
        }
        sb.append(year+1).append("\n");
        sb.append(year);
        System.out.println(sb);
    }
}