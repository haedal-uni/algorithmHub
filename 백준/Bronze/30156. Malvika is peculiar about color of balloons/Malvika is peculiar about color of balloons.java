import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        for(int i=0;i<n;i++){
            String[] arr = br.readLine().split("");
            a=0;
            b=0;
            for (String s : arr) {
                if (s.equals("a")) {
                    a++;
                } else {
                    b++;
                }
            }
            if(a==0 || b==0){
                sb.append("0\n");
            }else if(a>b){
                sb.append(b).append("\n");
            }else{
                sb.append(a).append("\n");
            }
        }
        System.out.print(sb);
    }
}