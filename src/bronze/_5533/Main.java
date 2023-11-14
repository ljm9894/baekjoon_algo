package bronze._5533;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[n][3];
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int j=0;j<3;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
       for(int i=0;i<n;i++){
           for(int j=0;j<3;j++){
               int a =0;
               for(int k=0;k<n;k++){
                   if(i!=k && arr[i][j] == arr[k][j]){
                       arr[k][j]=0;
                       a = 1;
                   }
               }
               if(a==1) arr[i][j] =0;
           }
           System.out.println(arr[i][0]+ arr[i][1] + arr[i][2]);
       }
    }
}
