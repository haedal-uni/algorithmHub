import java.io.*;
import java.util.*;
public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {8,7,6,5,4,3,2,1};
        int p = 0;
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        if(arr1[0]==x){
            p=f(arr1);
        }
        else if(arr2[0]==x){
            p=f(arr2);
        }
        if(p==0){
            System.out.print("mixed");
        }else if(p==1){
            System.out.print("ascending");
        }else{
            System.out.print("descending");
        }
    }
    public static int f(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=Integer.parseInt(st.nextToken())){
                return 0;
            }
        }
        if(arr[0]==1){
            return 1;
        }else{
            return 2;
        }
    }
}