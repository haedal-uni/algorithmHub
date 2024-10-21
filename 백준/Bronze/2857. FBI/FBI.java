import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<5; i++){
            if(br.readLine().contains("FBI")){
                sb.append(i+1).append(" ");
            }
        }
        if(sb.length()==0){
            sb.append("HE GOT AWAY!");
        }
        System.out.print(sb);
    }
}