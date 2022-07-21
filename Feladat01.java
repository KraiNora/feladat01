public class Feladat01 {

    public int feladat01(String[] szinek){
        int len = szinek.length;
        if(len<=1)
            return 0;

        int result = 0;

        int k = 2;

        for(int i=0;i<len;i++){
            result += factorial(len)/(factorial(k) * factorial(len-k));
            k++;
        }

        return result;
    }

    static int factorial(int end){
        int fact = 1;
        int i = 1;
        while(i<=end){
            fact*=i;
            i++;
        }
        return fact;
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
