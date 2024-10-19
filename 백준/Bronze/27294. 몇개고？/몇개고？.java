import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int t = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        if(s==1||t>16||t<12){
            System.out.print("280");
        }else{
            System.out.print("320");
        }
    }
}