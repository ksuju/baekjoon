import java.util.Scanner;
public class Main {
    
    static int guguDan (int N) {
        for(int i=1;i<=9;i++) {
            if(N>=1 && N<=9)
            System.out.printf("%d * %d = %d%n",N,i,N*i);
        }
        return N;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        guguDan(N);
	}
}
