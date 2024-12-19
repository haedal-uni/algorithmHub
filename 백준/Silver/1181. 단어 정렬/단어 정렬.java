import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        boolean change = false;
        int len = 0;
        for(int i=0; i<n; i++){
            change = false;
            String x = br.readLine();
            if(list.contains(x)){
                continue;
            }
            len = x.length();
            for(int j=0; j<list.size(); j++){
                if(len<list.get(j).length() && !change){
                    list.add(j,x);
                    change = true;
                    break;
                }else if(len==list.get(j).length() && !change){
                    String y = list.get(j);
                    if(x.compareTo(y)<0){
                        list.add(j,x);
                        change = true;
                    }
                }
            }
            if(!change){
                list.add(x);
            }
        }
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}