/**
 * @author Korsakova Anastasiya
 * Класс MathBox, реализующий следующий функционал:
 * Входной массив любого размера
 * методы Summator, Splitter, Eraser
 */

import java.util.*;


public class MathBox extends ObjectBox<Double> {

    // Конструктор на вход получающий массив Number
    MathBox(Number[] numbers){
        Set<Double> otherNumbers = new HashSet<>();
        for (int k = 0; k < numbers.length; k++) {
            otherNumbers.add(numbers[k].doubleValue());
        }
        for (Double otherNumber : otherNumbers) {
            this.addObject(otherNumber);
        }
    }

    // метод summator, возвращающий сумму всех элементов коллекции
    public double summator(){
        double j = 0;
        for (Double number : objects) {
           j = j + number;
        }
        return j;
    }
    // метод splitter, выполняющий поочередное деление всех хранящихся в объекте элементов на делитель, являющийся аргументом метода.
    // Хранящиеся в объекте данные полностью заменяются результатами деления.
    public void splitter(int divider){
        double a =0;
        for (int i = 0; i < objects.size(); i++) {
            a = objects.get(i) / divider;
            objects.set(i, a);
        }

    }

    // метод deleteIntNumber, который получает на вход Integer и если такое значение есть в коллекции, удаляет его.
    public void deleteIntNumber(Integer numberToDelete){
        this.deleteObject(numberToDelete.doubleValue());
    }

    public static void main(String[] args) {
        MathBox mathBox = new MathBox(new Number[]{1,2,3,4,5});
        System.out.println(mathBox.summator());
        mathBox.splitter(5);
        System.out.println(mathBox.summator());

    }

}

