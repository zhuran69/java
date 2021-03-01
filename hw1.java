package homework1;

public class hw1 {
    public static void main(String[] args) {

        System.out.println (myFir (10,6,4,5));
        System.out.println (mySec (99,10));
        myThr(-10);
        myFou("Anton");
    }

    public static double myFir (int a, int b, int c, int d) {
        double result = a * (b + (c / d));

        return result;
    }

    public static  boolean mySec (int a, int b) {
        boolean result;
        if ((a+b)>10 && (a+b) <=20) {
            result = true;
        } else result = false;
        return result;
    }

    public static void myThr (int a) {
        if (a>=0) {
            System.out.println ("Положительное");
        } else System.out.println ("Отрицательное");
    }


    public static void myFou (String name) {
        System.out.println ("Привет, " + name + "!");
    }


}
