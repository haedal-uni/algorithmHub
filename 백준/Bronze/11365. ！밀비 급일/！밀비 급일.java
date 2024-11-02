import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder x = new StringBuilder();
        while (true){
            x.append(br.readLine());
            if(x.toString().equals("END")){
                break;
            }
            sb.append(x.reverse()).append("\n");
            x.delete(0,x.length());
        }
        System.out.print(sb);
    }
}