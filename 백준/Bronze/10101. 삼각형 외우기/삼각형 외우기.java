import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        int x = 0;
        int y = 0;
        for(int i=0;i<3; i++){
            x = Integer.parseInt(br.readLine());
            sum+=x;
            if(list.contains(x)){
                y++;
            }
            list.add(x);
        }
        if(sum!=180){
            System.out.print("Error");
        }else if(y==0){
            System.out.print("Scalene");
        }else if(y==1){
            System.out.print("Isosceles");
        }else{
            System.out.print("Equilateral");
        }
    }
}