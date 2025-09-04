import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        String[] x = br.readLine().split("");
        for(int i=0; i<n; i++){
            String y = x[i];
            if(!y.equals(" ") && !y.equals(",") && !y.equals(".")){
                arr[y.charAt(0) - 'a']++;
            }
        }
        int max = 0;
        for(int i=0; i<26; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}