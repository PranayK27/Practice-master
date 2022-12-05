package interview;

public class Array2DConcept {
    public static void main(String args[]) {
        int twodarray[][] = new int[4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) //row
        {
            for (j = 0; j < 5; j++) //column
            {
                twodarray[i][j] = k;
                //System.out.print(twodarray[i][j]);
                k++;
            }
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(twodarray[i][j]+" ");
            }System.out.println();
        }
    }
}
