import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split(" ");
        String[] y = br.readLine().split(" ");
        int sum = 0;
        for(int i=0; i<n; i++){
            if(x[i].equals(y[i])){
                sum++;
            }else if(Integer.parseInt(x[i])>Integer.parseInt(y[i])){
                sum+=3;
            }
        }
        System.out.print(sum);
    }
}