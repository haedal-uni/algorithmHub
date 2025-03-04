import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int grade_1_2 = 0;
        int grade_3_4_0 =  0;
        int grade_3_4_1 =0;
        int grade_5_6_0 = 0;
        int grade_5_6_1 = 0;
        int room = 0;
        for(int i=0; i<n; i++) {
            String[] x = br.readLine().split(" ");
            if(x[1].equals("1")||x[1].equals("2")){
                grade_1_2++;
            }else if(x[1].equals("3")||x[1].equals("4")){
                if(x[0].equals("0")){
                    grade_3_4_0++;
                }else{
                    grade_3_4_1++;
                }
            }else{
                if(x[0].equals("0")){
                    grade_5_6_0++;
                }else{
                    grade_5_6_1++;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(grade_1_2);
        list.add(grade_3_4_0);
        list.add(grade_3_4_1);
        list.add(grade_5_6_0);
        list.add(grade_5_6_1);
        for (Integer integer : list) {
            if (integer%k != 0) {
                room++;
            }
            room += integer/k;
        }
        System.out.print(room);
    }
}