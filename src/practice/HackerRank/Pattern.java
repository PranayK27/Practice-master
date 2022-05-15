package practice.HackerRank;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int k=1; k<=n; k++){
            for(int j=1; j<=n-k; j++){
                System.out.print(" ");
            }
            for(int i=1; i<=k; i++){
                System.out.print("#");
            }
            if(k<n){
                System.out.println();
            }
        }
    }

}
/**
 * 6
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 * */
