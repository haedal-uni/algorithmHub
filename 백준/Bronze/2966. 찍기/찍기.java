import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] a = {"A", "B", "C"};
        String[] b = {"B","A","B","C"};
        String[] c = { "C", "C", "A", "A", "B", "B"};
        int n = Integer.parseInt(br.readLine());
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;
        String[] x = br.readLine().split("");
        for(int i=0; i<n; i++){
            String y = x[i];
            if(y.equals(a[i%a.length])){
                ans1++;
            }
            if(y.equals(b[i%b.length])){
                ans2++;
            }
            if(y.equals(c[i%c.length])){
                ans3++;
            }
        }
        int max = Math.max(ans1, Math.max(ans2, ans3));
        boolean flag = false;
        if(max==ans1){
            sb.append(ans1).append("\n").append("Adrian").append("\n");
            flag = true;
        }
        if(max==ans2){
            if(flag){
                sb.append("Bruno").append("\n");
            }else{
                sb.append(ans2).append("\n").append("Bruno").append("\n");
                flag = true;
            }
        }
        if(max==ans3){
            if(flag){
                sb.append("Goran").append("\n");
            }else{
                sb.append(ans3).append("\n").append("Goran").append("\n");
            }
        }
        System.out.print(sb);
    }
}