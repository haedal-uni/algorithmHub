import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        String[] str = br.readLine().split("");
        for(int i=0; i<n; i++) {
            if(str[i].equals("E")) {
                x++;
            }else if(str[i].equals("W")) {
                x--;
            }else if(str[i].equals("S")) {
                y++;
            }else{
                y--;
            }
        }
        System.out.print(Math.abs(x)+Math.abs(y));
    }
}