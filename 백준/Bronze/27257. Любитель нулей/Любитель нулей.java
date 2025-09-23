import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int x = Integer.parseInt(s);
        int count = 0;
        while (true){
            if(x%10==0){
                x/=10;
            }else{
                break;
            }
        }
        String a = x+"";
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)=='0'){
                count++;
            }
        }
        System.out.print(count);
    }
}