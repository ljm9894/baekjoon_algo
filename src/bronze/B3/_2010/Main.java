package bronze.B3._2010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int multiTab = arr[0];
        for(int i=1;i<n;i++){
            multiTab += arr[i] -1 ;
        }
        System.out.println(multiTab);
    }
}
