import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Nums = br.readLine();

        // 문자열을 문자 배열로 변환
        char[] digits = Nums.toCharArray();

        // 문자 배열을 정렬
        Arrays.sort(digits);

        // 정렬된 문자 배열을 역순으로 출력
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
