import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Korsakova Anastasiya
 * Класс ObjectBox, реализующий следующий функционал:
 * addObject, deleteObject, dump
 */

public class ObjectBox<T>{
    List<Object> objects;

    // конструктор для объекта objects
    ObjectBox(){

        this.objects = new ArrayList<>();
    }


    // метод addObject добавляет объект в коллекцию
    public void addObject(Object addInCollection){

        this.objects.add(addInCollection);
    }

    // метод deleteObject проверяет наличие объекта в коллекции и при наличии удаляющий его
    public void deleteObject(Object deleteFromCollection){

        this.objects.remove(deleteFromCollection);
    }

    // метод dump выводит содержимое коллекции в строку
    public String dump(){

        return this.objects.toString();
    }

    public static void main(String[] args) {
        ObjectBox newObjectBox = new ObjectBox();
        newObjectBox.addObject(5);
        newObjectBox.addObject("Настя");
        newObjectBox.addObject(56.0);
        newObjectBox.deleteObject(1);
        newObjectBox.deleteObject(56.0);
        System.out.println(newObjectBox.dump());
    }
}
