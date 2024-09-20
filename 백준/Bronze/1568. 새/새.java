import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sec = 0;
        int i=1;
        while (n>0){
            if(n<i){
                i=1;
            }
            n-=i;
            sec++;
            i++;
        }
        System.out.println(sec);
    }
}