import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        String w = "qwertasdfgzxcv";
        if(w.contains(s[s.length-1])){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}