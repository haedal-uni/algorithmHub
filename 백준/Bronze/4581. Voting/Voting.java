import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if(s.equals("#")) break;
            double x = s.length();
            s = s.replaceAll("A","");
            double y = s.length();
            int sum = 0;
            if(x/2<=(x-y)){
                sb.append("need quorum").append("\n");
            }else{
                for(int i=0; i<s.length(); i++) {
                    char c = s.charAt(i);
                    if(c=='Y'){
                        sum++;
                    }else if(c=='N'){
                        sum--;
                    }
                }
                if(sum>0){
                    sb.append("yes").append("\n");
                }else if(sum==0){
                    sb.append("tie").append("\n");
                }else{
                    sb.append("no").append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}