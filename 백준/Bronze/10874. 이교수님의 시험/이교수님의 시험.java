import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            count=0;
            String[] s = br.readLine().split(" ");
            for(int j=1; j<s.length+1; j++){
                x = ((j-1)%5)+1;
                if(s[j-1].equals(x+"")){
                    count++;
                }
            }
            if(count==10){
                sb.append(i+1).append("\n");
            }
        }
        System.out.print(sb);
    }
}