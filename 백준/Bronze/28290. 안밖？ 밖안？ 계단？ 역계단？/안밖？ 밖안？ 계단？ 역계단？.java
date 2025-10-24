import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        switch (s) {
            case "fdsajkl;":
            case "jkl;fdsa":
                System.out.print("in-out");
                break;
            case "asdf;lkj":
            case ";lkjasdf":
                System.out.print("out-in");
                break;
            case "asdfjkl;":
                System.out.print("stairs");
                break;
            case ";lkjfdsa" :
                System.out.print("reverse");
                break;
            default:
                System.out.print("molu");
        }
    }
}