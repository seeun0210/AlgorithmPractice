import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numbers = new int[N]; 

       
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

       

        int count = 0;

       
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (numbers[i] + numbers[j] == M) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
