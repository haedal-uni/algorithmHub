import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split("");
        int j = 0;
        int o = 0;
        int i = 0;
        for(int a=0; a<n; a++){
           if(x[a].equals("J")){
               j++;
           }else if(x[a].equals("O")){
               o++;
           }else{
               i++;
           }
        }
        System.out.print("J".repeat(j)+"O".repeat(o)+"I".repeat(i));
    }
}