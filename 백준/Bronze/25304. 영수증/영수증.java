import java.util.Scanner;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int list = sc.nextInt();
		int Arr[] = new int[list];
		int sum = 0;
		
		for(int i=0;i<list;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			Arr[i] = A * B;
		}
		
		for(int i=0;i<Arr.length;i++) {
			sum += Arr[i];
		}
		if (sum==total) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
	}
}
