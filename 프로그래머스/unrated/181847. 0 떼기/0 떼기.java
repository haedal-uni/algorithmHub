class Solution {
    public String solution(String n_str) {
        int i=0;
        while(true){
            if(!n_str.split("")[i].equals("0")){
                break;
            }
            i++;
        }
        return n_str.substring(i);
    }
}