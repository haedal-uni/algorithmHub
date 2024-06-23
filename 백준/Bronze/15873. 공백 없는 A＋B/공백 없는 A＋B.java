import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] x = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        String y = "";
        int sum = 0;
        for(int i=0;i<x.length-1; i++){
            y = x[i];
            if(y.equals("1")&&x[i+1].equals("0")){
                sb.append(10).append(" ");
            }else{
                sb.append(y).append(" ");
            }
        }
        sb.append(x[x.length-1]);
        x = sb.toString().split(" ");
        for(String z : x){
            sum+=Integer.parseInt(z);
        }
        System.out.println(sum);
    }
}