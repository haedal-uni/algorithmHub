import java.lang.*;
class Solution {
    public String solution(String my_string, String alp) {
        StringBuffer sb = new StringBuffer();
        if(my_string.contains(alp)){
            for(int i=0; i<my_string.length(); i++){
                if(my_string.split("")[i].equals(alp)){
                    sb.append(my_string.split("")[i].toUpperCase());
                }else{
                    sb.append(my_string.split("")[i]);
                }
            }
        }else{
            return my_string;
        }
        return sb.toString();
    }
}