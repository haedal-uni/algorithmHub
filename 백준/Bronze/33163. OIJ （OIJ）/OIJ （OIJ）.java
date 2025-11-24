import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            if(s[i].equals("O")){
                sb.append('I');
            }else if(s[i].equals("I")){
                sb.append('J');
            }else{
                sb.append('O');
            }
        }
        System.out.print(sb);
    }
}