import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<3; i++){
            arr[i] *= Integer.parseInt(st.nextToken());
        }
        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
        for(int i=0; i<3; i++){
            if(arr[i]==max){
                if(i==0){
                    list.add("Joffrey");
                }else if(i==1){
                    list.add("Robb");
                }else{
                    list.add("Stannis");
                }
            }
        }
        Arrays.sort(arr);
        for (String s : list) {
            sb.append(s).append(" ");
        }
        System.out.print(sb);
    }
}