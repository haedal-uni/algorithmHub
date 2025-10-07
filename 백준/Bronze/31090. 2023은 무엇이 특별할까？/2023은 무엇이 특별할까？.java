import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        for(int i=0; i<n; i++){
            String s = br.readLine();
            x = Integer.parseInt(s.substring(s.length()-2));
            if((Integer.parseInt(s)+1)%x==0){
                sb.append("Good").append("\n");
            }else{
                sb.append("Bye").append("\n");
            }
        }
        System.out.print(sb);
    }
}