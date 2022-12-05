package interview.HackerRank;

import java.io.*;

class ResultClass {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s){
        // Write your code here
        //Sample 07:05:45PM
        // Get hours
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        int se = Integer.parseInt(s.substring(6, 8));
        String AmPm = s.substring(8, 10);
        String HoraMM = String.format("%02d:%02d:%02d",h,m,se);
        //%02d = upto 2 int digits


        if(AmPm.equals("PM") && h < 12) {
            h+=12;
            HoraMM =String.format("%02d:%02d:%02d",h,m,se);
        }
        else if(AmPm.equals("AM") && h == 12){
            h=0;
            HoraMM =String.format("%02d:%02d:%02d",h,m,se);
        }

        return HoraMM;
    }

}

public class TwelveToTwentyFourHr {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = ResultClass.timeConversion(s);

        bufferedReader.close();
    }
}
