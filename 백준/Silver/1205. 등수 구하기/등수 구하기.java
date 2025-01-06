import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int rank = 1;
        List<Integer> list = new ArrayList<>();
        if(n>0){
            st=new StringTokenizer(br.readLine());
        }
        list.add(score);
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Collections.reverseOrder());
        for(int i=0; i<n+1; i++){
            if(n<p){
                if(list.get(i)==score){
                    break;
                }
            }else{
                if(list.get(i)==score&&rank<=p){
                    if(i<n){
                        if(list.get(n)==score||list.get(i+1)==score&&rank==p){
                            rank=-1;
                        }
                    }
                    break;
                }
            }
            if(rank>p){
                rank=-1;
                break;
            }
            rank++;
        }
        System.out.print(rank);
    }
}