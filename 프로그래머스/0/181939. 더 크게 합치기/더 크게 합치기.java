class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        
        a = Integer.parseInt(a1+b1);
        b = Integer.parseInt(b1+a1);
        
        if(a>b) {
        	answer = a;
        } else {
        	answer = b;
        }
        
        return answer;
    }
}