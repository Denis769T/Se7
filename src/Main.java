//Создать проект калькулятора комплексных чисел (достаточно сделать сложение,
//        умножение и деление).
//         Применить при создании программы архитектурные паттерны, добавить
//        логирование калькулятора.
//        Соблюдать принципы SOLID, паттерны проектирования.
//        Можно выбрать другой язык программирования, например C# или Python, если
//        выбран язык, отличный от JAVA, то необходимо написать документ, каким
//        образом можно запустить приложение (что необходимо установить, каким
//        образом запускать и т.п.)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ComplexNumber number1 = new ComplexNumber(3.0, 4.0); //Задаём первое комплексное число.
        ComplexNumber number2 = new ComplexNumber(4.0, 5.0); // Задаём второе комплексное число.
        Calculator calculator = new Calculator(); //Калькулятор.

        Logg.log("Выберите действие:");
        Logg.log("1 - Сложение");
        Logg.log("2 - Вычитание");
        Logg.log("3 - Умножение");
        Logg.log("4 - Деление");
        Logg.log("-----------------------------");
        int choice = input.nextInt(); // обработка введённых данных
        Logg.log("-----------------------------");
        switch (choice) { // проверка введенных пользователем данных
            case 1 -> calculator.setOperation(ComplexNumber::theAmount);
            case 2 -> calculator.setOperation(ComplexNumber::subtract);
            case 3 -> calculator.setOperation(ComplexNumber::multiplication);
            case 4 -> calculator.setOperation(ComplexNumber::division);
            default -> Logg.log("Неверный выбор действия.");
        }
        calculator.executeOperation(number1, number2);
        Logg.log("-----------------------------");
    }
}
