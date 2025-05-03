import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int count = 0;
        int y = 0;
        for(int i=0; i<x.length; i++){
            if(x[i].charAt(0)==97||x[i].charAt(0)==101||x[i].charAt(0)==105||x[i].charAt(0)==111||x[i].charAt(0)==117){
                count++;
            }else if(x[i].charAt(0)==121){
                y++;
            }
        }
        System.out.println(count+" "+(y+count));
    }
}