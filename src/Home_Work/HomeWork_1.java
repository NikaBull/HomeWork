package Home_Work;

public class HomeWork_1 {
    // Типы целочисленные
    byte myNameByte = 25;
    short myNmeShort = 32000;
    int myNameint = 99999999;
    long myNamelong = 1000000;

    //Типы плавающей точкой
    float myNmamefloat = 130.0F;
    double myNamedouble = 140.0;

    //Логический тип
    boolean myNamebollean8bit = true; // false = ложь

    //Символьный тип
    char myNamechar = 'n';

    //Строки
    String myNamestring = "Всем привет";


    public static void main(String[] args) {
        System.out.println(args[0]);
        String endresult;
        endresult = "" + test3(22.2F, 34.8F, 32.6F, 6.24F);
        System.out.println(endresult);
        test4(6, 8);

        System.out.println(test4());


    }

    public static float test3(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    public static int test4(int c, int d) {
        int a = 10;
        int b = 20;
        int vol = (c + d)       ;

        if (a < (c + d) < b) {

            return 1;
        } else {

            return 0;
        }
        }


    }
}
