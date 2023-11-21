package bronze.B1._2947;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        while(true) {
            boolean check = false;
            for (int i = 1; i < 5; i++) {

                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    check = true;
                    for (int j = 0; j < 5; j++) sb.append(arr[j]).append(' ');
                    sb.append('\n');
                }

            }
            if(check == false){
                break;
            }
        }

        System.out.println(sb);
    }

}
