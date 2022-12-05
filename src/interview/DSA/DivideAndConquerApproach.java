package interview.DSA;

public class DivideAndConquerApproach {
}

class DAC{
    static int DACtoFindMaxElement(int a[], int index, int l) { int max;
        if (l - 1 == 0) { return a[index];
        }
        if (index >= l - 2) {
            if (a[index] > a[index + 1]) return a[index];
            else
                return a[index + 1];
        }
        max = DACtoFindMaxElement(a, index + 1, l);
        if (a[index] > max) return a[index];
        else
            return max;
    }
}
