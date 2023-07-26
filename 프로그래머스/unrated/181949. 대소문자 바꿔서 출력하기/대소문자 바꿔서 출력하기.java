import java.util.Scanner;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String a = sc.next();
        String b = "";
        for(int i=0; i<a.length(); i++){
            b = a.split("")[i];
            if((int) b.charAt(0) > 96){
                sb.append(b.toUpperCase());
            }else{
                sb.append(b.toLowerCase());
            }
        }
        System.out.print(sb.toString());
    }
}