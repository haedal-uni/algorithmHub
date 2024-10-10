import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n<425){
            System.out.print("Violet");
        }else if(n<450){
            System.out.print("Indigo");
        }else if(n<495){
            System.out.print("Blue");
        }else if(n<570){
            System.out.print("Green");
        }else if(n<590){
            System.out.print("Yellow");
        }else if(n<620){
            System.out.print("Orange");
        }else{
            System.out.print("Red");
        }
    }
}