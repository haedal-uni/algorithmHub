import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] x = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] y = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i=0; i<m-1; i++){
            count+= x[i];
        }
        System.out.println(y[(count+d)%7]);
    }
}