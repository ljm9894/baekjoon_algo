package bronze.B2._1100;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str;
        int cnt=0;
        str = new String[100];
        for(int i=0;i<8;i++){
            str[i] = scanner.nextLine();
        }

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if((i+j)%2 == 0 && str[i].charAt(j)=='F'){

                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
