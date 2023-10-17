class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int num = 0;
        int x = 0;
        if(n==1){
            answer = new int[slicer[1]+1];
            for(int i=0; i<slicer[1]+1; i++){
                answer[i] = num_list[i];
            }
        }else if(n==2){
            answer = new int[num_list.length-slicer[0]];
            for(int i=slicer[0]; i<num_list.length; i++){
                answer[num] = num_list[i];
                num++;
            }
        }else if(n==3){
            answer = new int[slicer[1] - slicer[0] +1];
            for(int i=slicer[0]; i<slicer[1]+1; i++){
                answer[num] = num_list[i];
                num++;
            }
        }else{
            if((slicer[1] - slicer[0] +1)%slicer[2]!=0){
                x = 1;
            }
            answer = new int[(slicer[1] - slicer[0] +1)/slicer[2] + x];
            for(int i=slicer[0]; i<slicer[1]+1; i+=2){
                answer[num] = num_list[i];
                num++;
            }
        }
        return answer;
    }
}