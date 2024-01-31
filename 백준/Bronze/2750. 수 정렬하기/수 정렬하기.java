import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        // 배열 A에 값 입력
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        sc.close();

        // 배열 A를 오름차순으로 정렬
        Arrays.sort(A);

        // 정렬된 배열 A 출력
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}
