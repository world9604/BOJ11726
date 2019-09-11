import java.util.Scanner;

public class Main {
    /**
     * @문제
     * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
     * 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
     *
     * @입력
     * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
     * @출력
     * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
     * @예제입력
     * 2
     * @예제출력
     * 2
     * @예제입력
     * 9
     * @예제출력
     * 55
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double[] dp = new double[num + 1];
        double result = getFibonacciValue(num, dp);
        System.out.printf("%.0f", result);
    }

    static private double getFibonacciValue(int num, double[] dp) {
        if (num <= 0) return 0;
        if (num == 1) return 1;
        if (num == 2) return 2;
        if (dp[num] != 0) return dp[num];
        return dp[num] = (getFibonacciValue(num - 2, dp) + getFibonacciValue(num - 1, dp)) % 10007;
    }
}
