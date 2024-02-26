package app;

import calculator_decorator.Calculator;
import calculator_decorator.Decorator;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */

public class App {
    public static void main(String[] args) {
        int result = Calculator.add(2, 2);
        System.out.println(Decorator.decorate(result, "addition"));
        result = Calculator.sub(2, 2);
        System.out.println(Decorator.decorate(result, "subtraction"));
        result = Calculator.mul(2, 2);
        System.out.println(Decorator.decorate(result, "multiplication"));
        result = Calculator.div(2, 2);
        System.out.println(Decorator.decorate(result, "division"));
    }

}
