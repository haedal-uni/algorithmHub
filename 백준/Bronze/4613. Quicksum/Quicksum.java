import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (true) {
            String[] x = br.readLine().split("");
            sum = 0;
            if(x[0].equals("#")){
                break;
            }
            for(int i=1; i<x.length+1; i++){
                if(x[i-1].charAt(0)==32){
                    continue;
                }
                sum+=i*(x[i-1].charAt(0)-64);
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}