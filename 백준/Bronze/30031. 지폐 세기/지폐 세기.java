import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0;i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s){
                case "136":
                    sum+=1000;
                    break;
                case "142":
                    sum+=5000;
                    break;
                case"148":
                    sum+=10000;
                    break;
                case "154":
                    sum+=50000;
                    break;
            }
        }
        System.out.print(sum);
    }
}