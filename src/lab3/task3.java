package lab3;

import java.util.Scanner;

class OnlineStore {
    public static void main(String[] args) {
        double product1Price = 50.0;
        double product2Price = 30.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите валюту, в которую хотите конвертировать (USD, EUR, RUB): ");
        String targetCurrency = scanner.nextLine();
        if (targetCurrency.equals("USD")){
            System.out.println("Стоимость товара 1: " + product1Price);
            System.out.println("Стоимость товара 2: " + product2Price);
        }
        else if (targetCurrency.equals("RUB")){
            System.out.println("Стоимость товара 1: " + (product1Price) * 95);
            System.out.println("Стоимость товара 2: " + (product2Price) * 95);
        }
        else if (targetCurrency.equals("EUR")){
            System.out.println("Стоимость товара 1: " + (product1Price) * 0.8);
            System.out.println("Стоимость товара 2: " + (product2Price) * 0.8);
        }
        else{
            System.out.println("Неправильно ввели валюту");
        }

        Employee[] employees = new Employee[2];

        employees[0] = new Employee("Павлов Павел Эдуардович", 450000.0);
        employees[1] = new Employee("Убемубуебуе Оницуэуэ Убимуги Осас", 40.0);

        Report.generateReport(employees);
    }
}

class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");
        System.out.println("=====================");
        System.out.printf("%-20s %15s%n", "ФИО", "Зарплата");
        System.out.println("-----------------------------");
        for (Employee employee : employees) {
            String fullname = employee.getFullname();
            double salary = employee.getSalary();
            System.out.printf("%-20s %15s%n", fullname, salary + " RUB");
        }
    }
}
