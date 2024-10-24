import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        List<Integer> arrL = new ArrayList<Integer>();
        
        for(int i=0;i<queries.length;i++) {
        	for(int j=0;j<queries[i].length;j++) {
        		arrL.add(queries[i][j]);
        	}
        }

        List<Integer> aaa = new ArrayList<Integer>();
        for(int i=0;i<arrL.size();i++) {
        	if(i%3==0) {
        		aaa.add(0,arrL.get(i));
        	} else if (i%3==1) {
        		aaa.add(1,arrL.get(i));
        	} else if (i%3==2) {
        		aaa.add(2,arrL.get(i));
        		
        		for(int j=0;j<arr.length;j++) {
                	if((j>=aaa.get(0)&&j<=aaa.get(1))&&j%aaa.get(2)==0) {
                		arr[j]=arr[j]+1;
                	}
                }
        		aaa.clear();
        	}
        }
        
        return answer=arr;
    }
}