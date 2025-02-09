import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String x = br.readLine();
            if(x.equals("P=NP")){
                sb.append("skipped").append("\n");
            }else{
                sb.append(Integer.parseInt(x.split("\\+")[0])+
                Integer.parseInt(x.split("\\+")[1]))
                        .append("\n");
            }
        }
        System.out.print(sb);
    }
}