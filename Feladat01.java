public class Feladat01 {

    public int feladat01(String[] szinek) {
        int len = szinek.length;
        if (len <= 1) {
            return 0;
        }

        return pow(len) - len - 1;
    }

    static int pow(int n) {
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow *= 2;
        }
        return pow;
    }


    public static void main(String[] args) {

        Feladat01 f = new Feladat01();
        String[] szinek0 = {};
        String[] szinek1 = {"piros"};
        String[] szinek2 = {"piros", "kek"};
        String[] szinek3 = {"piros", "kek", "zold"};
        int keveres = f.feladat01(szinek3);
        System.out.println("valasz: " + keveres);
    }
}
