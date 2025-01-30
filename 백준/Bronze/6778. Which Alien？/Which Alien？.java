import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        if(a>2 && b<5){
            sb.append("TroyMartian").append("\n");
        }
        if(a<7 && b>1){
            sb.append("VladSaturnian").append("\n");
        }
        if(a<3 && b<4){
            sb.append("GraemeMercurian");
        }
        System.out.print(sb);
    }
}