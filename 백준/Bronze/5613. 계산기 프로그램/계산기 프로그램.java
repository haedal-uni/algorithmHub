import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        String input = "";
        while (!input.equals("=")){
            input = br.readLine();
            if(input.equals("+")){
                sum+=Integer.parseInt(br.readLine());
            }else if(input.equals("-")){
                sum-=Integer.parseInt(br.readLine());
            }else if(input.equals("*")){
                sum*=Integer.parseInt(br.readLine());
            }else if(input.equals("/")){
                sum/=Integer.parseInt(br.readLine());
            }
        }
        System.out.print(sum);
    }
}