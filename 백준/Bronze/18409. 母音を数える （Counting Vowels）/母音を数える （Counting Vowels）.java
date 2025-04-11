import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        br.readLine();
        String[] x = br.readLine().split("");
        for(String s:x){
            if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")){
                n++;
            }
        }
        System.out.print(n);
    }
}