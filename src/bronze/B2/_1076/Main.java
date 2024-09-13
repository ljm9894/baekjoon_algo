package bronze.B2._1076;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        long cnt = 0;
        long fin = 0;
        for(int i=0;i<3;i++){
            String in = br.readLine();
            if(i==2){
                if(in.equals("black")){
                    cnt = 1;
                }
                else if(in.equals("brown")){
                    cnt = 10;
                }
                else if(in.equals("red")){
                    cnt = 100;
                }
                else if(in.equals("orange")){
                    cnt = 1000;
                }
                else if(in.equals("yellow")){
                    cnt = 10000;
                }
                else if(in.equals("green")){
                    cnt = 100000;
                }
                else if(in.equals("blue")){
                    cnt = 1000000;
                }
                else if(in.equals("violet")){
                    cnt = 10000000;
                }
                else if(in.equals("grey")){
                    cnt = 100000000;
                }
                else if(in.equals("white")){
                    cnt = 1000000000;
                }
                break;
            }
            if(in.equals("black")){
                result = result.concat("0");
            }
            else if(in.equals("brown")){
                result = result.concat("1");
            }
            else if(in.equals("red")){
                result = result.concat("2");
            }
            else if(in.equals("orange")){
                result = result.concat("3");
            }
            else if(in.equals("yellow")){
                result = result.concat("4");
            }
            else if(in.equals("green")){
                result = result.concat("5");
            }
            else if(in.equals("blue")){
                result = result.concat("6");
            }
            else if(in.equals("violet")){
                result = result.concat("7");
            }
            else if(in.equals("grey")){
                result = result.concat("8");
            }
            else if(in.equals("white")){
                result = result.concat("9");
            }

        }
        fin = Long.parseLong(result)*cnt;
        System.out.println(fin);
    }
}
