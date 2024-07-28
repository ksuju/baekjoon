import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = B+C;
		if(D<60) {
			System.out.println(A+" "+D);
		} else if(D>=60) {
			A=A+(D/60);
			if(A>=24&&A<48) {
				A=A-24;
				D=D%60;
				System.out.println(A+" "+D);
			} else if(A<24) {
				D=D%60;
				System.out.println(A+" "+D);
			}
		}
	}
}
