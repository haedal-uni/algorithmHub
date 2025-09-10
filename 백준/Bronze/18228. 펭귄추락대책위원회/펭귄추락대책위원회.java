import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean flag = false;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            String a = st.nextToken();
            if(a.equals("-1")){
                flag = true;
                continue;
            }
            if(flag){
                list2.add(Integer.parseInt(a));
            }else{
                list1.add(Integer.parseInt(a));
            }
        }
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.print(list1.get(0) + list2.get(0));
    }
}