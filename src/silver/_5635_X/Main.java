package silver._5635_X;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int year, month, day;
        int a=9999,b=12,c=31;
        String result;
        for(int i=0;i<n;i++){
            String name = sc.next();
            year = sc.nextInt();
            month = sc.nextInt();
            day = sc.nextInt();
            if(a>=year){
               if(b>=month){
                   if(c>=day){
                       a = year;
                       b = month;
                       c = day;
                       result = name;
                   }
               }
            }
        }
        System.out.println();

    }
}
