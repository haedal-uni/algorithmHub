import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String[] arr;
        int sum = 0;
        while (x>9){
            arr = (""+ x).split("");
            x=1;
            for (String s : arr) {
                x *= Integer.parseInt(s);
            }
            sum+=1;
        }
        System.out.println(sum);
    }
}