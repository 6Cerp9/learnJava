package lab8;

public class eightfive {
    public static void main(String[] args){
        int N = 12345;
        int sum = Calculator(N);
        System.out.println("Сумма цифр числа " + N + "равна" + sum);
    }


    public static int Calculator(int num) {
        if (num < 10) {
            return num;
        } else {
            int lastDig = num % 10;
            int remDig = num / 10;
            int sumRemDig = Calculator(remDig);
            return lastDig + sumRemDig;
        }
    }
}
