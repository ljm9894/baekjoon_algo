package bronze.B1._1236;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        String[] s = new String[n];

        for(int i=0;i<n;i++){
            s[i] = br.readLine();
                if(!s[i].contains("X")){
                    cnt++;
                }
        }
        int max = cnt;
        cnt = 0;
        for(int i = 0; i<m;i++){
            int cnts=0;
            for(int j = 0;j<n;j++){
                if(s[j].charAt(i)=='.'){
                    cnts++;
                }
            }
            if(cnts == n) cnt++;
        }
        max = Math.max(max, cnt);
        System.out.printf("%d", max);
    }
}
