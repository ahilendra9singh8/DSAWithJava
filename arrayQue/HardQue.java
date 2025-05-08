package arrayQue;

public class HardQue {
    public static void main(String[] args) {

        // 1.Pascal's Triangle
        // 1.1-> give r(rows) and c(columns) than i want output direct
        int r = 5;
        int c = 3;
        int result = fun_nCr(r - 1, c - 1);
        System.out.println(result);

        //1.2 : print any given row




        // 1.3: print pascals Triangle

    }

    private static int fun_nCr(int n, int r) { // nCr = n!/r!*(n-r)!
        int result = 1;
        for (int i = 0; i < r; i++) {
            result = result * (n - i);
            result = result / (i + 1);
        }
        return result;
    }
}
