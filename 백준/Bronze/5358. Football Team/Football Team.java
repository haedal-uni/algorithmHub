import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String s = br.readLine();
            if(s==null) break;
            String[] x = s.split("");
            for(int i=0; i<x.length; i++) {
                if(x[i].equals("i")){
                    sb.append("e");
                }else if(x[i].equals("e")){
                    sb.append("i");
                }else if(x[i].equals("I")){
                    sb.append("E");
                }else if(x[i].equals("E")){
                    sb.append("I");
                }else{
                    sb.append(x[i]);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}