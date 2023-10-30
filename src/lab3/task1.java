package lab3;

public class task1 {
    public static void main(String[] args) {
        //1 подзадание
        Double number1 = Double.valueOf(3.14);
        Double number2 = Double.valueOf(42.0);

        //2 подзадание
        String str = "3.14";
        double parsedDouble = Double.parseDouble(str);

        //3 подзадание
        Double doubleObject = Double.valueOf(3.14);
        double prDouble = doubleObject.doubleValue();
        float prFloat = doubleObject.floatValue();
        int prInt = doubleObject.intValue();
        long prLong = doubleObject.longValue();
        short prShort = doubleObject.shortValue();
        byte prByte = doubleObject.byteValue();

        //4 подзадание
        Double number = Double.valueOf(3.14);
        System.out.println("Значение Double: " + number);

        //5 подзадание
        double d = 3.14;
        String strr = Double.toString(d);
    }
}
