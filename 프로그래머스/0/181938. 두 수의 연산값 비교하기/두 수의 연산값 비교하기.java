class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int i = 2*a*b; 

        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        
        a = Integer.parseInt(a1+b1);
        
        
        return answer=(a>i)?a:i;
    }
}