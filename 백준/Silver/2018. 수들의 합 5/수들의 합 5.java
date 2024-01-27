import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] A = new int[N];

        // 배열에 1부터 N까지의 숫자를 넣기
        for (int i = 0; i < N; i++) {
            A[i] = i + 1;
        }

        int startIndex = 0, endIndex = 0;
        int sum = 0;

        while (startIndex < N) {
            if (sum == N) {
                count++;
                sum -= A[startIndex];
                startIndex++;
            } else if (sum < N && endIndex < N) {
                sum += A[endIndex];
                endIndex++;
            } else {
                sum -= A[startIndex];
                startIndex++;
            }
        }

        System.out.println(count);
    }
}
