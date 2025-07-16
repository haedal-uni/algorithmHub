import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            String s = br.readLine();
            x = s.length();
            s = s.replace("CD","");
            if(s.length()==x){
                count++;;
            }
        }
        System.out.print(count);
    }
}