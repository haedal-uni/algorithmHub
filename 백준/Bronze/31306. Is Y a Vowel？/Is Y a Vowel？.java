import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int count = 0;
        int y = 0;
        for (String s : x) {
            if(s.charAt(0)==97||s.charAt(0)==101||s.charAt(0)==105||s.charAt(0)==111||s.charAt(0)==117){
                count++;
            }else if(s.charAt(0)==121){
                y++;
            }
        }
        System.out.print(count+" "+(y+count));
    }
}