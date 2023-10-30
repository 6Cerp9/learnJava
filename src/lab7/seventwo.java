package lab7;

interface MathCalculable {
    double power(double base, double exponent);
    double complexModulus(double real, double imaginary);
    double getPI();
}

class MathFunc implements MathCalculable {
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    @Override
    public double getPI() {
        return Math.PI;
    }
}

public class seventwo {
    public static void main(String[] args) {
        MathCalculable mathFunc = new MathFunc();

        double radius = 5.0;
        double circumference = 2 * mathFunc.getPI() * radius;

        System.out.println("Длина окружности с радиусом " + radius + " равна " + circumference);
    }
}

