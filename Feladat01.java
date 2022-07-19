public class Feladat01 {
    public int feladat01(String[] szinek){
        int len = szinek.length;
        int n = 1;
        for (int i = len; i > 0; i--) {
            n *= i;
        }
        int k = 2;

        int nmink = 1;
        for (int i = len - k; i > 0; i--)
            nmink *= i;

        return n / (k * nmink) + n / (k * (k + 1));
    }


    public static void main(String[] args) {

        Feladat01 f = new Feladat01();
        String[] szinek0 = {};
        String[] szinek1 = {"piros"};
        String[] szinek2 = {"piros", "kek"};
        String[] szinek3 = {"piros", "kek", "zold" };
        int keveres = f.feladat01(szinek3);
        System.out.println("valasz: " + keveres);
    }
}
