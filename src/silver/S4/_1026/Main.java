package silver.S4._1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        int arr[] = new int[n];
        Integer brr[] = new Integer[n];
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            brr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(brr, Collections.reverseOrder());
        for(int i = 0; i<n;i++){
            sum += arr[i] *brr[i];
        }
        System.out.println(sum);
    }
}
