package silver._5635;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] result = new String[n][4];
        for(int i=0;i<n;i++){
            result[i][0] = sc.next();
            result[i][1] = sc.next();
            result[i][2] = sc.next();
            result[i][3] = sc.next();
        }

        Arrays.sort(result, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(Integer.parseInt(o1[3])==Integer.parseInt(o2[3])){
                    if(Integer.parseInt(o1[2])==Integer.parseInt(o2[2])){
                        return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
                    }else{
                        return Integer.compare(Integer.parseInt(o1[2]), Integer.parseInt(o2[2]));
                    }
                }
                return Integer.compare(Integer.parseInt(o1[3]), Integer.parseInt(o2[3]));
            }
        });
        System.out.println(result[n-1][0]);
        System.out.println(result[0][0]);

    }
}
