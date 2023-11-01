package bronze._3062;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            input = sc.next();
            String reverse = "";
            Boolean check = false;

            for(int j= input.length()-1; j>=0; j--){
                reverse = reverse+input.charAt(j);
            }

            int sum = Integer.parseInt(input) + Integer.parseInt(reverse);
            String processSumForString = Integer.toString(sum);

            for(int j=0;j<(processSumForString.length()/2); j++){
                char left = processSumForString.charAt(j);
                char right = processSumForString.charAt(processSumForString.length()-j-1);
                if(left!= right){
                    check = true;
                    break;
                }
            }
            if(check == false) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
