import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder x = new StringBuilder();
        String y = "";
        while (true){
            y = br.readLine();
            if(y.equals("0")){
                break;
            }
            x.append(y).reverse();
            if(y.contentEquals(x)){
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }
            x.delete(0,x.length());
        }
        System.out.print(sb);
    }
}