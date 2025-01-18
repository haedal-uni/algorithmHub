import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        String[] arr = {"M","O","B","I","S"};
        int count = 0;
        for(String s : arr) {
            if(!x.contains(s)) {
                break;
            }
            count++;
        }
        if(count==5){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}