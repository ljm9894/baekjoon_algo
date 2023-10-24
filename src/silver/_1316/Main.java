package silver._1316;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int cnt=0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(check()==true){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean check(){
        boolean[] check = new boolean[26];
        int pred=0;
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            int now = str.charAt(i);
            if(pred != now){
                if(check[now-'a']== false){
                    check[now-'a'] = true;
                    pred = now;
                }else{
                    return false;
                }
            }

        }
        return true;
    }

}
