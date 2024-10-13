class Solution {
    public String solution(String code) {
        String ret = "";

        boolean mode = true;
        char[] chArr = code.toCharArray();
        
        for(int i=0;i<chArr.length;i++) {
        	a : if(mode) {
        		if(chArr[i]=='1') {
    				mode = false;
    				break a;
    			}
        		if(i%2==0) {
        			ret += chArr[i];
        		}
        	} else {
        		if(chArr[i]=='1') {
     				mode = true;
     				break a;
     			}
        		if(i%2!=0) {
        			ret += chArr[i];
        		}
        	}
        }
        if(ret=="") {
    		ret = "EMPTY";
    	}
        
        return ret;
    }
}