import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        for(int i=0; i<n; i++){
            String s = br.readLine();
            String a = s.split("-")[0];
            x = Integer.parseInt(s.split("-")[1]);
            y = (a.split("")[0].charAt(0) - 65)*26*26 +
                    (a.split("")[1].charAt(0)-65)*26 +
                    (a.split("")[2].charAt(0)-65);
            if(Math.abs(x-y)<=100){
                sb.append("nice").append("\n");
            }else{
                sb.append("not nice").append("\n");
            }
        }
        System.out.print(sb);
    }
}