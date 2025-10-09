import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            int x = 0;
            if(s.equals("0")){
                break;
            }
            while (true){
                for(int i=0;i<s.length();i++){
                    x+=s.charAt(i)- '0';
                }
                if(x<10){
                    sb.append(x).append("\n");
                    break;
                }else{
                    s=x+"";
                    x=0;
                }
            }
        }
        System.out.print(sb);
    }
}