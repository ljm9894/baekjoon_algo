package bronze._2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);
        for(int i=0;i<5;i++){
            sum+=arr[i];
        }
        System.out.println(sum/5);
        System.out.println(arr[2]);

    }
}
