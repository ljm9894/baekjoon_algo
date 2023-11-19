package silver.S5._2822;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[151];
        int cnt = 5;
        int sum =0;
        for(int i=1;i<=8;i++){
            int k = sc.nextInt();
            arr[k] = i;
        }
        List<Integer> num = new ArrayList<>();
        for(int i=150;i>0;i--){
            if(arr[i]!=0){
                sum+=i;
                cnt--;
                num.add(arr[i]);
            }
            if(cnt==0) break;
        }
        Collections.sort(num);
        System.out.println(sum);
        for(int i=0;i<5;i++){
            System.out.printf("%d ",num.get(i));
        }
    }
}
