import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        int sum = x.length;
        for(String s:x){
            if(s.equals(":")){
                sum++;
            }
            if(s.equals("_")){
                sum+=5;
            }
        }
        System.out.print(sum);
    }
}