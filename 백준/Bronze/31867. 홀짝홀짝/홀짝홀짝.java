import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int even = 0;
        int odd = 0;
        br.readLine();
        String[] x = br.readLine().split("");
        for (String s : x) {
            if (Integer.parseInt(s) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if(even>odd){
            System.out.println(0);
        }else if(odd>even){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
    }
}