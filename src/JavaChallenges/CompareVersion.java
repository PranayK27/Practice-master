package JavaChallenges;


import java.util.Arrays;

class VersionNumber{
    public static int compare(String v1, String v2){
        int[] a1 = Arrays.stream(v1.split("\\."))
                .map(String::trim) //  <classname>::<methodname>
                .mapToInt(Integer::parseInt).toArray();

        int[] a2 = Arrays.stream(v2.split("\\."))
                .map(String::trim)
                .mapToInt(Integer::parseInt).toArray();

        int idx = 0;

        while(idx < a1.length || idx < a2.length){
            if (idx < a1.length && idx < a2.length){
                if (a1[idx] < a2[idx]){
                    return -1;
                } else if (a1[idx] > a2[idx]){
                    return 1;
                }
            } else if ( idx < a1.length){
                if (a1[idx] != 0){
                    return 1;
                }
            } else if ( idx < a2.length){
                if (a2[idx] != 0){
                    return -1;
                }
            }
            idx++;
        }
        return 0;
    }
}
public class CompareVersion {
    public static void main(String args[]){
        VersionNumber versionNumber = new VersionNumber();

        System.out.println(versionNumber.compare("20.1.1", "15.1.2"));
    }
}
