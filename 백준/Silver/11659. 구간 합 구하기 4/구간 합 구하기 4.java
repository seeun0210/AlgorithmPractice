import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int A[]=new int[N];
        int S[]=new int[N+1];
        S[0]=0;
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            S[i+1]=A[i]+S[i];
        }
        for(int i=0;i<M;i++){
            int B=sc.nextInt();
            int C=sc.nextInt();
            System.out.println(S[C]-S[B-1]);
        }

    }
}
