// Импортируем класс Enum для использования перечисления
package lab44;

// Перечисление для брендов компьютеров
enum ComputerBrand {
    ASUS, HP, Dell, Lenovo, Acer
}

// Класс для описания проца
class Processor {
    private final String brand;
    private final String model;
    private final double clockSpeedGHz;

    public Processor(String brand, String model, double clockSpeedGHz) {
        this.brand = brand;
        this.model = model;
        this.clockSpeedGHz = clockSpeedGHz;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", Clock Speed: " + clockSpeedGHz + " GHz";
    }
}

// Класс для ОЗУ
class Memory {
    private final int capacityGB;
    private final String memoryType;

    public Memory(int capacityGB, String memoryType) {
        this.capacityGB = capacityGB;
        this.memoryType = memoryType;
    }

    @Override
    public String toString() {
        return "Capacity: " + capacityGB + " GB, Type: " + memoryType;
    }
}

// Класс для описания монитора
class Monitor {
    private final String brand;
    private final int sizeInches;
    private final String resolution;

    public Monitor(String brand, int sizeInches, String resolution) {
        this.brand = brand;
        this.sizeInches = sizeInches;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return brand + " Monitor, Size: " + sizeInches + " inches, Resolution: " + resolution;
    }
}

// Класс для описания компьютера
class Computer {
    private final ComputerBrand brand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer Brand: " + brand + "\nProcessor: " + processor + "\nMemory: " + memory + "\nMonitor: " + monitor;
    }
}

public class lab4 {
    public static void main(String[] args) {
        Processor processor1 = new Processor("Intel", "Core i7", 3.5);
        Memory memory1 = new Memory(16, "DDR4");
        Monitor monitor1 = new Monitor("Dell", 27, "2560x1440");
        Computer computer1 = new Computer(ComputerBrand.Dell, processor1, memory1, monitor1);
        Processor processor2 = new Processor("AMD", "Ryzen", 4);
        Memory memory2 = new Memory(32, "LDDR4");
        Monitor monitor2 = new Monitor("Lenovo", 30, "2560x1080");
        Computer computer2 = new Computer(ComputerBrand.Dell, processor2, memory2, monitor2);

        System.out.println(computer1);
        System.out.println();
        System.out.println(computer2);
    }
}

