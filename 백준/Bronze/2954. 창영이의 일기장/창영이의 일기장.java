import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<x.length; i++){
            if(x[i].equals("a")||x[i].equals("e")||x[i].equals("i")||x[i].equals("o")||x[i].equals("u")){
                sb.append(x[i]);
                i+=2;
            }else{
                sb.append(x[i]);
            }
        }
        System.out.print(sb);
    }
}