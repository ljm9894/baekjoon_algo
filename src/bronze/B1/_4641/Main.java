package bronze.B1._4641;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int cnt=0;
            int i=0;
            int arr[] = new int[16];
            while(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                if(a ==-1)  return;
                arr[i] = a;
                i++;
            }
            Arrays.sort(arr);

            for(int j=0;j<16;j++){
                for(int k=j;k<16;k++){
                    if(arr[j]==0 || arr[k]==0){
                        continue;
                    }
                    if(arr[k] == arr[j]*2){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
