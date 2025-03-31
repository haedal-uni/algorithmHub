import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<n; i++){
            String[] x = br.readLine().split("");
            sum = 0;
            for(int j=0; j<x.length; j++){
                if(!x[j].equals(" ")){
                    sum+=x[j].charAt(0)-64;
                }
            }
            if(sum==100){
                sb.append("PERFECT LIFE").append("\n");
            }else{
                sb.append(sum).append("\n");
            }
        }
        System.out.print(sb);
    }
}