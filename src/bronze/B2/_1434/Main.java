package bronze.B2._1434;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();
        int aSum = 0;
        int bSum = 0;
        String c = bf.readLine();
        StringTokenizer st = new StringTokenizer(c);
        while(st.hasMoreTokens()){
            aSum += Integer.parseInt(st.nextToken());
        }
        c = bf.readLine();
        st = new StringTokenizer(c);
        while(st.hasMoreTokens()){
            bSum += Integer.parseInt(st.nextToken());
        }
        System.out.println(aSum-bSum);
    }
}
