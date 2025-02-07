import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        if(a.contains(n+"")){
            String[] b = a.split(" ");
            for(int i=0; i<b.length; i++){
                if(b[i].equals(n+"")){
                    System.out.println(i+1);
                    break;
                }
            }
        }else{
            System.out.print(0);
        }
    }
}