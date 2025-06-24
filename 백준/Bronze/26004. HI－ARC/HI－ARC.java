import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[5];
        String[] str = br.readLine().split("");
        for(int i=0;i<n;i++){
            if(str[i].equals("H")){
                arr[0]++;
            }else if(str[i].equals("I")){
                arr[1]++;
            }else if(str[i].equals("A")){
                arr[2]++;
            }else if(str[i].equals("R")){
                arr[3]++;
            }else if(str[i].equals("C")){
                arr[4]++;
            }
        }
        Arrays.sort(arr);
        System.out.print(arr[0]);
    }
}