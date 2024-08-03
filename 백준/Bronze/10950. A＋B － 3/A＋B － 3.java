import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int Arr[] = new int[c];
		
		for(int i=0;i<c;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Arr[i] = a+b; 
		}
		for(int i=0;i<Arr.length;i++) {
			System.out.println(Arr[i]);
		}
	}
}
