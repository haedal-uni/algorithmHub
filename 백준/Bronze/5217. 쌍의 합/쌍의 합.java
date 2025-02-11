import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            int y = 0;
            int z = 0;
            int count = 0;
            sb.append("Pairs for ").append(x).append(": ");
            while (true){
                y+=1;
                z=x-y;
                if(y==z || y>z){
                    break;
                }
                if(count>0){
                    sb.append(", ");
                }
                sb.append(y).append(" ").append(z);
                count++;
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}