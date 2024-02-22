import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] st;
        String[][] wo = new String[5][];
        int max = 0;
        int x=0;
        int y=0;
        int[] len = new int[5];
        for(int i=0; i<5; i++){
            st = br.readLine().split("");
            len[i] = st.length;
            if(max<st.length){
                max = st.length;
            }
            wo[i] = st;
        }
        while (true){
            if(y>=max){
                break;
            }
            if(y>len[x]-1){
                x++;
            }else{
                sb.append(wo[x][y]);
                x++;
            }
            if(x>=5){
                x=0;
                y++;
            }
        }
        System.out.println(sb);
    }
}