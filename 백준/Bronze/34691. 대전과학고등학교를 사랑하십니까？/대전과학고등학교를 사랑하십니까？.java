import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String x = br.readLine();
            if(x.equals("end")) break;
            switch (x) {
                case "animal":
                    sb.append("Panthera tigris").append("\n");
                    break;
                case "flower":
                    sb.append("Forsythia koreana").append("\n");
                    break;
                case "tree":
                    sb.append("Pinus densiflora").append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}