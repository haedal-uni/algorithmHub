import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        int i=1;
        while (true){
            if(list.contains(i) || x<i){
                break;
            }
            if(x/i>0 && x%i==0){
                if(!list.contains(i)){
                    list.add(i);
                }
                if(!list.contains(x/i)){
                    list.add(x/i);
                }

            }
            i++;
        }
        Collections.sort(list);
        if(list.size()>=y){
            System.out.println(list.get(y-1));
        }else {
            System.out.println(0);
        }
    }
}