package bronze.B3._1267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int Y = 0;
        int M = 0;
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        for(int i=0;i<n;i++){
            int t = Integer.parseInt(st.nextToken());
            Y += ((t/30)+1)*10;
            M += ((t/60)+1)*15;
        }
        if(Y==M){
            System.out.printf("Y M %d", Y);
        }else if(Y<M){
            System.out.printf("Y %d", Y);
        }else{
            System.out.printf("M %d", M);
        }
    }

}
