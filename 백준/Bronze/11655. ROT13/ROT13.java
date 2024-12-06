import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = 0;
        String[] arr = br.readLine().split("");
        for (String s : arr) {
            x = s.charAt(0);
            if(x>96&&x<123){
                x=x+13;
                if(x>122){
                    x=96+x%122;
                }
                sb.append((char)x);
            }else if(x>64&&x<91){
                x+=13;
                if(x>90){
                    x=64+x%90;
                }
                sb.append((char)x);
            }else {
                sb.append((char)x);
            }
        }
        System.out.print(sb);
    }
}