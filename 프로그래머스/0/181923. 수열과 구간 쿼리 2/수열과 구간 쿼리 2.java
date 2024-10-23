import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int min = -1;
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0;i<queries.length;i++) {
        	for(int j=queries[i][0];j<=queries[i][1];j++) {
        		if(arr[j]>queries[i][2]) {
        			al.add(arr[j]);
                	min = Collections.min(al);
                	answer[i] = min;
        		}
        		if(al.isEmpty()==true) {
            		answer[i]=-1; 
            	}
        	}
            al.clear();
        }
        return answer;
    }
}