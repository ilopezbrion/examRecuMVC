import org.junit.jupiter.params.provider.EnumSource;

import java.util.ArrayList;
public class Model {


    public static double sumarNum(double a, double b) {
        return a + b;
    }

    public double restarNum(double a, double b) {
        return a - b;
    }

    public double multiplicarNum(double a, double b) {
        return a * b;
    }

    public double dividirNum(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }


}