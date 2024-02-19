import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        x.append(st.nextToken()).reverse();
        y.append(st.nextToken()).reverse();
        if(Integer.parseInt(x.toString())>Integer.parseInt(y.toString())){
            System.out.println(x);
        }else{
            System.out.println(y);
        }
    }
}