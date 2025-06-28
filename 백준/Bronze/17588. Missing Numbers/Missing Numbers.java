import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int start = 1;
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for(int i=0; i<n; i++){
            x = Integer.parseInt(br.readLine());
            while (x != start) {
                sb.append(start).append("\n");
                start++;
            }
            start++;
        }
        if(sb.length() == 0){
            System.out.print("good job");
        }else{
            System.out.print(sb);
        }
    }
}