import java.io.*;
import java.util.*;
public class Main {
    public static List<String> list;
    public static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("all")||s.equals("empty")){
                if(s.equals("all")){
                    all();
                }else{
                    empty();
                }
            }else{
                String t = st.nextToken();
                switch(s){
                    case "add":
                        add(t);
                        break;
                    case "remove":
                        remove(t);
                        break;
                    case "check" :
                        check(t);
                        break;
                    case "toggle" :
                        toggle(t);
                        break;
                }
            }

        }
        System.out.print(sb);
    }
    public static void add(String x){
        if(!list.contains(x)){
            list.add(x);
        }
    }
    public static void remove(String x){
        list.remove(x);
    }
    public static void check(String x){
        if(list.contains(x)){
            sb.append("1").append("\n");
        }else{
            sb.append("0").append("\n");
        }
    }
    public static void toggle(String x){
        if(list.contains(x)){
            list.remove(x);
        }else{
            list.add(x);
        }
    }
    public static void all(){
        list = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9","10","11","12","13","14","15","16","17","18","19","20"));
    }
    public static void empty(){
        list.clear();
    }
}