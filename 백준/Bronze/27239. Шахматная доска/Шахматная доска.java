import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] x = {"a","b","c","d","e","f","g","h"};
        int col = (n-1)%8;
        int row = (n-1)/8+1;
        System.out.print(x[col] + row);
    }
}