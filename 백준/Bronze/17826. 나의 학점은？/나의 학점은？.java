import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[50];
        int count = 1;
        int x = Integer.parseInt(br.readLine());
        for(int i=0; i<50; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Collections.reverse(List.of(arr));
        for(int i=0; i<50; i++){
            if(arr[i] == x){
                break;
            }
            count++;
        }
        if(count<=5){
            System.out.print("A+");
        }else if(count<=15){
            System.out.print("A0");
        }else if(count<=30){
            System.out.print("B+");
        }else if(count<=35){
            System.out.print("B0");
        }else if(count<=45){
            System.out.print("C+");
        }else if(count<=48){
            System.out.print("C0");
        }else{
            System.out.print("F");
        }
    }
}