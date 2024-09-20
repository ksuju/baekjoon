import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i=0;i<a.length();i++) {
			char b = a.charAt(i);
			int c = b-0;
            
			if(c>=65&&c<97) {
				b = (char)(c+32);
				System.out.print(b);
			} else {
				b = (char)(c-32);
				System.out.print(b);
			}
		}
    }
}