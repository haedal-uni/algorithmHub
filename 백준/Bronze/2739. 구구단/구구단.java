import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<10; i++){
            if(i==9){
                sb.append(num + " * " + i + " = " + num*i);
            }else{
                sb.append(num + " * " + i + " = " + num*i).append("\n");
            }
        }
        System.out.print(sb);
    }
}