import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = "";
        String[] s;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        StringBuilder sb = new StringBuilder();
        while (true){
            x = br.readLine();
            if(x==null|| x.isBlank()){
                break;
            }
            s = x.split("");
            for (String string:s) {
                if (string.charAt(0)==32) {
                    d++;
                } else if(string.charAt(0)>=48 && string.charAt(0)<=57) {
                    c++;
                } else if (string.charAt(0)>= 65 && string.charAt(0)<=90) {
                    b++;
                } else if (string.charAt(0)>=97 && string.charAt(0)<=122) {
                    a++;
                }
            }
            sb.append(a).append(" ").append(b).append(" ").append(c).append(" ").append(d).append("\n");
            a=0;
            b=0;
            c=0;
            d=0;
        }
        System.out.print(sb);
    }
}