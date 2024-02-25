import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] x = new int[10];
        String[] y;
        y = ((a*b*c) + "").split("");
        for(int i=0; i<y.length; i++){
            x[Integer.parseInt(y[i])] = ++x[Integer.parseInt(y[i])];
        }
        sb.append(x[0]).append("\n")
                .append(x[1]).append("\n")
                .append(x[2]).append("\n")
                .append(x[3]).append("\n")
                .append(x[4]).append("\n")
                .append(x[5]).append("\n")
                .append(x[6]).append("\n")
                .append(x[7]).append("\n")
                .append(x[8]).append("\n")
                .append(x[9]);
        System.out.println(sb);
    }
}