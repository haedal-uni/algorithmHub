import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if(isJava(input)) {
            System.out.print(javaToC(input));
        }
        else if(isC(input)) {
            System.out.print(cToJava(input));
        }
        else{
            System.out.print("Error!");
        }
    }

    private static boolean isJava(String s) {
        if(Character.isUpperCase(s.charAt(0)) || s.contains("_")) {
            return false;
        }
        for(char c:s.toCharArray()) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isC(String s) {
        if(s.startsWith("_") || s.endsWith("_") || s.contains("__")) {
            return false;
        }
        for(char c:s.toCharArray()) {
            if(!Character.isLetter(c) && c!='_') {
                return false;
            }
        }
        for(char c:s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    }

    private static StringBuilder javaToC(String s) {
        StringBuilder result = new StringBuilder();
        for(char c:s.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result.append('_').append(Character.toLowerCase(c));
            }else {
                result.append(c);
            }
        }
        return result;
    }

    private static StringBuilder cToJava(String s) {
        StringBuilder result = new StringBuilder();
        boolean toUpper = false;
        for (char c:s.toCharArray()) {
            if(c == '_') {
                toUpper = true;
            }else if (toUpper) {
                result.append(Character.toUpperCase(c));
                toUpper = false;
            }else {
                result.append(c);
            }
        }
        return result;
    }
}