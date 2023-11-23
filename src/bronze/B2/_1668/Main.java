package bronze.B2._1668;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt=1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(max < arr[i]){
                cnt++;
                max = arr[i];
            }
        }
        bw.write(cnt+"\n");

        cnt =1;
        max = arr[n-1];

        for(int i=n-2;i>=0;i--){
            if(max < arr[i]){
                cnt++;
                max = arr[i];

            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}
