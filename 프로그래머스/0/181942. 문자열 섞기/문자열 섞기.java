class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        if(str1.length()==str2.length()) {
        	for(int i=0;i<str1.length()+str2.length();i++){
                if(i%2!=0) {
                	answer += str2.charAt(i/2);
                } else {
                	answer += str1.charAt(i/2);
                }
            }
        }
        return answer;
    }
}