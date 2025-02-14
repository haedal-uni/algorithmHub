import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    x=list.get(i)+list.get(j)+list.get(k);
                    if(x>max && x<=m){
                        max = x;
                    }
                    if(x>m){
                        break;
                    }
                }
            }
        }
        System.out.print(max);
    }
}