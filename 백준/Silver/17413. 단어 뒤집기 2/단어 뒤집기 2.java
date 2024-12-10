import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        String[] x = br.readLine().split("");
        for(int i=0; i<x.length; i++){
            if(x[i].charAt(0)=='<'){
                sb.append(ss.reverse());
                ss.delete(0, ss.length());
                while(x[i].charAt(0)!='>'){
                    sb.append(x[i]);
                    i++;
                }
                sb.append(x[i]);
            } else if(x[i].charAt(0)==' '){
                sb.append(ss.reverse()).append(" ");
                ss.delete(0, ss.length());
            } else{
                ss.append(x[i]);
            }

        }
        sb.append(ss.reverse());
        System.out.print(sb);
    }
}