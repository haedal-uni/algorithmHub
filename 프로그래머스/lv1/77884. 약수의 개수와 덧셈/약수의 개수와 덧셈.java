class Solution {
    public static int x=0;
    public static int y=0;
    public int solution(int left, int right) {
        for(int i=left; i<right+1; i++){
            a(i);
        }
        return x-y;
    }
    public void a(int a){
        int answer=0;
        for(int i=1; i<a+1; i++){
            if(a%i==0){
                answer++;
            }
        }
        if(answer%2==0){
            x += a;
        }else{
            y += a;
        }
    }
}