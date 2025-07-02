import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<n; i++){
            String[] x = br.readLine().split("");
            for(int j=0; j<x.length; j++){
                if(x[j].equals("A")){
                    sum+=4;
                }else if(x[j].equals("K")){
                    sum+=3;
                }else if(x[j].equals("Q")){
                    sum+=2;
                }else if(x[j].equals("J")){
                    sum+=1;
                }
            }
        }
        System.out.print(sum);
    }
}