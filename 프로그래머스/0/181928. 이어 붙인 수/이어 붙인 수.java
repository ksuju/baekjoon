class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String 짝 = "";
        String 홀 = "";
        for(int i=0;i<num_list.length;i++) {
        	if(num_list[i]%2==0) {
        		짝 += (num_list[i]+"");
        	} else {
        		홀 += (num_list[i]+"");
        	}
        }        
        return answer=Integer.parseInt(짝)+Integer.parseInt(홀);
    }
}