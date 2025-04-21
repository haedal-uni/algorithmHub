import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<n; i++){
            count= 0;
            String x = br.readLine().replaceAll(" ","").toLowerCase();
            for(int j=0; j<x.length(); j++){
                if(x.charAt(j)=='a'||x.charAt(j)=='e'||x.charAt(j)=='i'||x.charAt(j)=='o'||x.charAt(j)=='u'){
                    count++;
                }
            }
            sb.append(x.length()-count).append(" ").append(count).append("\n");
        }
        System.out.print(sb);
    }
}