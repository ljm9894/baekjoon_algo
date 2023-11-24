package silver.S5._1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String word = br.readLine();

        int a = str.length();
        int b = word.length();
        str = str.replace(word, "");
        int result = (a-str.length())/b;
        System.out.println(result);
    }

}
