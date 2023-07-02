import java.lang.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        int num = my_string.length() - is_suffix.length();
        if(num>0){
            for(int i=num; i<my_string.length(); i++){
                sb.append(my_string.split("")[i]);
            }
            if(sb.toString().equals(is_suffix)){
                answer = 1;
            }
        }else{
            if(my_string.equals(is_suffix)){
                answer = 1;
            }
        }


        return answer;
    }
}