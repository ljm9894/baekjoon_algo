package bronze.B1._1157;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[26];
        int max = -999;
        char ch = '?';
        String str = scanner.next();
        for(int i=0;i<str.length();i++){
            if('A' <= str.charAt(i) && 'Z' >= str.charAt(i)){
                arr[str.charAt(i)-'A']++;
            }else{
                arr[str.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]>max){
                max = arr[i];
                ch = (char)(i+'A');
            }else if(arr[i] == max){
                ch = '?';
            }
        }
        System.out.print(ch);
        scanner.close();
    }
}
