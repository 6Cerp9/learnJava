package Lection_2;

public class Lecture_22{
    enum Season {WINTER, AUTUMN}; //эта проста хуета перечисление, паблик и статик
    //time = Season.WINTER;
    public static final double G = 6.67E-11;
    public enum Planet{
        MERCURY(11, 21),
        URANUS (20, 30);
        private final double mass;
        private final double radius;
        Planet(double mass, double radius){
            this.mass = mass; this.radius = radius;
        }
    }
    public class Die {
        private final int MAX = 6;
        private int faceValue;
    }
    public static void main(String[] args) {

    }
}

