package lab6;

interface Convertable {
    double convert(double value);
}

class CelToKelConv implements Convertable {
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

class CelToFahrConv implements Convertable {
    public double convert(double celsius) {
        // Формула F = (C × 9/5) + 32
        return (celsius * 9/5) + 32;
    }
}

public class TemperatureConverter {
    public static void main(String[] args){
        double celsiusTemperature = 25.0; // Пример температуры по Цельсию

        // Создаем объекты конвертеров
        Convertable celToKelConv1 = new CelToKelConv();
        Convertable CelToFahrConv1 = new CelToFahrConv();

        // Конвертация
        double kelvinTemperature = celToKelConv1.convert(celsiusTemperature);
        double fahrenheitTemperature = CelToFahrConv1.convert(celsiusTemperature);

        // Вывод результатов
        System.out.println(celsiusTemperature + " градусов Цельсия = " + kelvinTemperature + " Кельвин");
        System.out.println(celsiusTemperature + " градусов Цельсия = " + fahrenheitTemperature + " Фаренгейт");
    }
}
