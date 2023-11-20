package silver.S5._3135;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int cnt = 0;
        int min = Math.abs(a-b);
        for(int i = 0 ;i<n;i++){
            int x = Integer.parseInt(br.readLine());
            min = Math.min(Math.abs(b-x)+1, min);
        }
        System.out.println(min);

//        int min = 999;
//        if(min>Math.abs(a-b)){
//            min = Math.abs(a-b);
//        }
//        for(int i=0;i<n;i++){
//            if(Math.abs(b-arr[i])<=min){
//                min = Math.abs(b-arr[i]);
//                cnt++;
//            }
//        }
//        while(min!=0){
//            min--;
//            cnt++;
//        }
//        System.out.println(cnt);
    }
}
