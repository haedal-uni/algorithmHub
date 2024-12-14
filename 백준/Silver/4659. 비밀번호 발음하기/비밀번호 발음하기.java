import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> x = new ArrayList<>();
        int i = 0;
        while (true) {
            x.add(br.readLine());
            if(x.get(i).equals("end")){
                break;
            }
            sb.append("<").append(x.get(i)).append(">").append(" is ");
            if(one(x.get(i)) && two(x.get(i)) && three(x.get(i))){
                sb.append("acceptable.").append("\n");
            }else{
                sb.append("not acceptable.").append("\n");
            }
            i++;
        }
        System.out.print(sb);
    }
    public static boolean one(String s){
        return s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u");
    }
    public static boolean two(String s){
        int count = 0;
        int sum = 0;
        String[] a = s.split("");
        for (String str : a) {
            if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
                count++;
                sum = 0;
            } else {
                sum++;
                count = 0;
            }
            if(sum>=3||count>=3){
                return false;
            }
        }
        return true;
    }
    public static boolean three(String s){
        String[] a = s.split("");
        for(int i=0; i<a.length-1; i++){
            if (a[i].equals(a[i+1]) && !(a[i].equals("e") || a[i].equals("o"))) {
                return false;
            }
        }
        return true;
    }
}