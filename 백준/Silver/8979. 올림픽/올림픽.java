import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<int[]> countries = new ArrayList<>();
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            countries.add(new int[]{country, gold, silver, bronze});
        }
        countries.sort((a, b) -> {
            if(a[1]!=b[1]) {
                return b[1]-a[1];
            } else if(a[2]!=b[2]) {
                return b[2]-a[2];
            } else{
                return b[3]-a[3];
            }
        });
        int rank = 1;
        for(int i=0; i<countries.size(); i++) {
            if(i>0 && !isSame(countries.get(i-1),countries.get(i))) {
                rank=i+1;
            }
            if(countries.get(i)[0] == k) {
                break;
            }
        }
        System.out.print(rank);
    }
    private static boolean isSame(int[] a, int[] b) {
        return a[1]==b[1] && a[2]==b[2] && a[3]==b[3];
    }
}