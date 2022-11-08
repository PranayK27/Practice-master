package Java8.HackerRank.Strings;

class Result1 {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here
        int count = 0;
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i += 3) {
            if (ch[i] != 'S') {
                count++;
            }
            if (ch[i + 1] != 'O') {
                count++;
            }
            if (ch[i + 2] != 'S') {
                count++;
            }
        }
        return count;
    }

}


public class MarsExplorationProblem {

    public static void main(String[] args) {

        String s = "SOSSPSSQSSOR";

        int result = Result1.marsExploration(s);

        System.out.println(result);

    }

}
