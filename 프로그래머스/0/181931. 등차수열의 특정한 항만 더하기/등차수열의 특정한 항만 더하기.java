class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int[] arr = new int[included.length];
        
        for(int i=0;i<included.length;i++) {
        	if(i==0) {
        		arr[i] = a;
        	} else {
        		arr[i] = a+d;
        		a=a+d;
        	}
        	
        	if(included[i]) {
        		answer += arr[i];
        	}
        }

        return answer;
    }
}