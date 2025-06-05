import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String x = br.readLine();
            if(x.equals("TTYL")){
                sb.append("talk to you later");
                break;
            }
            switch (x){
                case "CU":
                    sb.append("see you").append("\n");
                    break;
                case ":-)":
                    sb.append("I’m happy").append("\n");
                    break;
                case ":-(":
                    sb.append("I’m unhappy").append("\n");
                    break;
                case ";-)":
                    sb.append("wink").append("\n");
                    break;
                case ":-P":
                    sb.append("stick out my tongue").append("\n");
                    break;
                case "(~.~)":
                    sb.append("sleepy").append("\n");
                    break;
                case "TA":
                    sb.append("totally awesome").append("\n");
                    break;
                case "CCC":
                    sb.append("Canadian Computing Competition").append("\n");
                    break;
                case "CUZ":
                    sb.append("because").append("\n");
                    break;
                case "TY":
                    sb.append("thank-you").append("\n");
                    break;
                case "YW":
                    sb.append("you’re welcome").append("\n");
                    break;
                default:
                    sb.append(x).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}