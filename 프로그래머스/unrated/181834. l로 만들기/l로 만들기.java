class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char c = 'l';
        String[] ans = myString.split("");
        for(int i=0; i<myString.length(); i++){
            if(ans[i].charAt(0)<(int) c){
                myString = myString.replace(ans[i], "l");
            }
        }
        return myString;
    }
}