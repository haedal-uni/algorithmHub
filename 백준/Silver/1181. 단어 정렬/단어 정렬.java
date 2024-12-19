import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int len = 0;
        boolean changed;
        for(int i=0; i<n; i++){
            String x = br.readLine();
            if(list.contains(x)){
                continue;
            }
            len = x.length();
            changed=false;
            for(int j=0; j<list.size(); j++){
                if(len<list.get(j).length()){
                    list.add(j,x);
                    changed=true;
                    break;
                }else if(len==list.get(j).length()){
                    if(x.compareTo(list.get(j))<0){
                        list.add(j,x);
                        changed=true;
                        break;
                    }
                }
            }
            if(!changed){
                list.add(x);
            }
        }
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.print(sb);
    }
}