import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // 문자열의 길이
        int P = Integer.parseInt(st.nextToken()); // 패턴의 길이
        String DNAString = br.readLine(); // DNA 문자열
        st = new StringTokenizer(br.readLine()); // 새로운 토큰화 시작
        int minA = Integer.parseInt(st.nextToken()); // 'A'의 최소 개수
        int minC = Integer.parseInt(st.nextToken()); // 'C'의 최소 개수
        int minG = Integer.parseInt(st.nextToken()); // 'G'의 최소 개수
        int minT = Integer.parseInt(st.nextToken()); // 'T'의 최소 개수

        // 초기화
        int count = 0;
        int[] charCount = new int[4]; // A, C, G, T의 개수를 저장할 배열

        // 초기 부분 문자열에서 각 문자의 개수 세기
        for (int i = 0; i < P; i++) {
            char currentChar = DNAString.charAt(i);
            updateCharCount(charCount, currentChar, 1); // 개수 업데이트
        }

        // 초기 부분 문자열에서 최소 개수와 비교
        if (charCount[0] >= minA && charCount[1] >= minC && charCount[2] >= minG && charCount[3] >= minT) {
            count++;
        }

        // 부분 문자열을 이동하면서 검사
        for (int i = P; i < S; i++) {
            char removedChar = DNAString.charAt(i - P); // 이전 문자열에서 제거되는 문자
            char newChar = DNAString.charAt(i); // 새로 추가되는 문자

            updateCharCount(charCount, removedChar, -1); // 이전 문자열의 문자 개수 업데이트
            updateCharCount(charCount, newChar, 1); // 새로운 문자열의 문자 개수 업데이트

            // 최소 개수와 비교
            if (charCount[0] >= minA && charCount[1] >= minC && charCount[2] >= minG && charCount[3] >= minT) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 문자열의 개수를 업데이트하는 메서드
    private static void updateCharCount(int[] charCount, char ch, int delta) {
        switch (ch) {
            case 'A':
                charCount[0] += delta;
                break;
            case 'C':
                charCount[1] += delta;
                break;
            case 'G':
                charCount[2] += delta;
                break;
            case 'T':
                charCount[3] += delta;
                break;
            default:
                break;
        }
    }
}
