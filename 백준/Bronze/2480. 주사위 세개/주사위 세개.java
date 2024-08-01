import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x==y&&y==z) {
			System.out.println(10000+x*1000);
		} else if(x==y||x==z) {
			System.out.println(1000+x*100);
		} else if(y==z) {
			System.out.println(1000+y*100);
		} else if(x!=y&&x!=z&&y!=z){
			int[] arr= {x,y,z};
			int h=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(h<arr[i]) {
					h=arr[i];
				}
			}
			System.out.println(h*100);
		}
	}
}
