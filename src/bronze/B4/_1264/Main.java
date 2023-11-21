package bronze.B4._1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int cnt=0;
            String str = sc.nextLine();
            if(str.charAt(0) == '#') break;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                    cnt++;
                }
                if(str.charAt(i)=='A' || str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U'){
                    cnt++;
                }

            }
            System.out.println(cnt);
        }
    }
}
