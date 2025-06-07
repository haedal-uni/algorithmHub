import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        list.add("l");
        list.add("k");
        list.add("p");
        int count = 0;
        for(int i=0; i<3; i++){
            String x = br.readLine();
            if(list.contains(x.charAt(0)+"")){
                count++;
                list.remove(x.charAt(0)+"");
            }
        }
        if(count==3){
            System.out.print("GLOBAL");
        }else{
            System.out.print("PONIX");
        }

    }
}