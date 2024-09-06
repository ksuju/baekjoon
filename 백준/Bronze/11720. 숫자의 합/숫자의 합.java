import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDigits = scanner.nextInt();  // 입력된 숫자의 자리 수
        String digitString = scanner.next();  // 숫자로 이루어진 문자열
        scanner.close();

        int digitSum = 0;
        
        for(int i = 0; i < numberOfDigits; i++) {
            digitSum += digitString.charAt(i) - '0';  // 각 자리 숫자의 합을 계산
        }
        System.out.print(digitSum);
    }
}