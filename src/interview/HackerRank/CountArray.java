package interview.HackerRank;

import java.io.*;

class ResultArray {

    /*
     * Complete the 'countArray' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER x
     */

    public static long countArray(int n, int k, int x) {
        // Return the number of ways to fill in the array.
        int mod = (int)Math.pow(10, 9)+7;
        long endInX[] = new long[n+1];
        long notEndInX[] = new long[n+1];

        endInX[1] = x==1 ? 1 : 0;
        notEndInX[1] = x==1 ? 0 : 1;

        for(int i=2; i<=n; i++){
            endInX[i] = notEndInX[i-1]%mod;
            notEndInX[i] = (endInX[i-1]*(k-1) + notEndInX[i-1]*(k-2))%mod;
        }

        return endInX[n];
    }

}

public class CountArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        int x = Integer.parseInt(firstMultipleInput[2]);

        long answer = ResultArray.countArray(n, k, x);

        bufferedReader.close();
    }
}
