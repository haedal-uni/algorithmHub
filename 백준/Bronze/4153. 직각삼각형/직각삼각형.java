import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] x;
        int a = 0;
        int b = 0;
        int c = 0;
        while (true){
            x= br.readLine().split(" ");
            a = Integer.parseInt(x[0]);
            b = Integer.parseInt(x[1]);
            c = Integer.parseInt(x[2]);
            if(a==0 && b==0 && c==0){
                break;
            }else{
                if(a*a+b*b==c*c || a*a==b*b+c*c || a*a+c*c==b*b){
                    sb.append("right").append("\n");
                }else{
                    sb.append("wrong").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}