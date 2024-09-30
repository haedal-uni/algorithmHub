import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int d = 0;
        for(int i=0; i<n; i++){
            d = Integer.parseInt(br.readLine());
            for(int j=1; j<d+1; j++){
                if(j+j*j>d){
                    sb.append(j-1).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}