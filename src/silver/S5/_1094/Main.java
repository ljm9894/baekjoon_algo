package silver.S5._1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int stick = 64;
        int cnt =0;

        while(n>0){
            if(n<stick){
                stick/=2;
            }else {
                n -= stick;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
