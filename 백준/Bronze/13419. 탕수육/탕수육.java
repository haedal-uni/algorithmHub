import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i=0; i<sum; i++){
            String[] x = br.readLine().split("");
            int j=0;
            while (true){
                if(j>x.length-1){
                    j=0;
                }
                if(a.toString().contains(x[j])){
                    break;
                }
                a.append(x[j]);
                j++;
                if(j>x.length-1){
                    j=0;
                }
                b.append(x[j]);
                j++;
            }
            sb.append(a).append("\n");
            sb.append(b).append("\n");
            a.delete(0, a.length());
            b.delete(0, b.length());
        }
        System.out.print(sb);
    }
}