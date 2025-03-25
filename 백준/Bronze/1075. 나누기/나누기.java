import java.util.*;

public class Main {
    
    public static String division(int N, int F) {
        int x = N - (N % 100);

        for (int i = 0; i < 100; i++) {
            if ((x + i) % F == 0) {
                return String.format("%02d", i);
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int F = scanner.nextInt();
        
        System.out.println(division(N, F));
        
        scanner.close();
    }
}
