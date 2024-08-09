import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int Arr[] = new int[x];
		
		for(int i=0;i<x;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Arr[i]=a+b;
		}
		for(int i=0;i<Arr.length;i++) {
			System.out.printf("Case #%d: %d%n",i+1,Arr[i]);
		}
	}
}
