import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        String sNum = sc.nextLine(); // 한 줄 전체를 입력 받음
        String[] nStrings = sNum.split(" ");
        long[] Nums = new long[N];

        for (int i = 0; i < nStrings.length; i++) {
            Nums[i] = Long.parseLong(nStrings[i]);
        }

        // 최댓값 구하기
        long MAX=0;
        for(int i=0;i<N;i++){
            if(MAX<=Nums[i]){
                MAX=Nums[i];
            }
        }

        // 새로운 과목 점수
        double[] newScores = new double[N]; // 실수형 배열로 선언하여 소수점을 보존합니다.
        for(int i=0; i<N;i++){

                newScores[i] = ((double) Nums[i] / MAX) * 100; // 정수 나눗셈을 피하기 위해 double로 캐스팅합니다.

        }
       
       

        // 총점 구하기
        double totalScore=0; 
        for(int i=0;i<N;i++){
            totalScore+=newScores[i];
        }
        System.out.println(totalScore/N); 

    }
}
