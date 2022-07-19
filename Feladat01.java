public class Feladat01 {

    public int feladat01(String[] szinek){
        int len = szinek.length;

        if(len <= 1)
            return 0;
        if(len == 2)
            return 1;

        else {
            int n = 1;
            for (int i = len; i > 0; i--) {
                n *= i;
            }

            int k = 2;

            int nmink = 1;
            for (int i = len - k; i > 0; i--)
                nmink *= i;

            return n/(k*nmink)+1;
        }

    }


    public static void main(String[] args) {

        Feladat01 f = new Feladat01();
        String[] szinek0 = {};
        String[] szinek1 = {"piros", "kek", "zold" };
        String[] szinek2 = {"piros"};
        String[] szinek3 = {"piros", "kek"};
        int keveres = f.feladat01(szinek1);
        System.out.println("valasz: " + keveres);
    }
}
