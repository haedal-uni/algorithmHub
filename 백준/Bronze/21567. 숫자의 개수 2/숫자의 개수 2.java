import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        long a = Long.parseLong(br.readLine());
        long b = Long.parseLong(br.readLine());
        long c = Long.parseLong(br.readLine());
        long d = a*b*c;
        String[] s = (d+"").split("");
        int[] arr = new int[10];
        for (String string : s) {
            arr[Integer.parseInt(string)]++;
        }
        for(int i=0; i<10; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}