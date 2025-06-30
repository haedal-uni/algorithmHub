import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = "SciComLove".split("");
        String[] s = br.readLine().split("");
        int count = 0;
        for(int i=0; i<str.length; i++){
            if(!str[i].equals(s[i])){
                count++;
            }
        }
        System.out.print(count);
    }
}