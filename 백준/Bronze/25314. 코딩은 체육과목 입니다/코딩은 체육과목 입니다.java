import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int x = N/4;
		if (N%4!=0) {
			x=x+1;
		}
		for(int i=0;i<x;i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
