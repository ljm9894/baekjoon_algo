package bronze.B1._1855;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str =br.readLine();
        int x = 0;
        char[][] array = new char[300][300];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length()/n;i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = str.charAt(x++);
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    array[i][j] = str.charAt(x++);
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<str.length()/n;j++){
                sb.append(array[j][i]);
            }

        }
        System.out.println(sb.toString());
    }
}
