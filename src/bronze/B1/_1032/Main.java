package bronze.B1._1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i] = br.readLine();
        }
        boolean isSame;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str[0].length();i++){
            char x = str[0].charAt(i);
            isSame = true;
            for(int j = 1;j<n;j++){
                if(x != str[j].charAt(i)){
                    isSame = false;
                    break;
                }
            }
            if(isSame == true){
                sb.append(x);
            }else{
                sb.append('?');
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
