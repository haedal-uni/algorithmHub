import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder ss = new StringBuilder();
        String[] x = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        List<String> list = new ArrayList<>();
        for(int i=m; i<=n; i++){
            ss.delete(0, ss.length());
            String[] a = (i+"").split("");
            for(String s : a) {
                ss.append(x[Integer.parseInt(s)]).append(" ");
            }
            list.add(ss.toString());;
        }
        Collections.sort(list);
        int count = 0;
        for(String a : list) {
            a = a.replaceAll("zero", "0")
                    .replaceAll("one", "1")
                    .replaceAll("two", "2")
                    .replaceAll("three", "3")
                    .replaceAll("four", "4")
                    .replaceAll("five", "5")
                    .replaceAll("six", "6")
                    .replaceAll("seven", "7")
                    .replaceAll("eight", "8")
                    .replaceAll("nine", "9")
                    .replaceAll(" ", "");
            if(count==10) {
                sb.append("\n");
                count=0;
            }
            sb.append(a).append(" ");
            count++;
        }
        System.out.print(sb);
    }
}