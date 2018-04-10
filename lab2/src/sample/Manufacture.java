package sample;

import java.util.ArrayList;

/**
 * Class "Manufacture"
 * Класс Завод, отвечающий за наем рабочих и выпуск продуктов
 */
public class Manufacture {
    private ArrayList<Worker> workers;
    private ArrayList<Product> products;

    /**
     * Конструктор класса создает два списка: рабочие и продукты
     */
    public Manufacture(){
        workers = new ArrayList<>();
        products = new ArrayList<>();
    }

    /**
     * Метод изготовления продукта, вызывает у каждого рабочего метод "Работать"
     * Создает экземпляр класса "Авто"
     * После выполнения работы вызывает метод "Курить"
     */
    public void makeProduct(){
        for(Worker w : workers){
            w.toWork();
            products.add(new Product());
        }
        Auto auto = new Auto();
        for(Worker w : workers){
            w.toSmoke();
        }
        System.out.println("---------------------");

    }

    /**
     * Метод добавляет нового рабочего
     */
    public void newWorker() {
        workers.add(new Worker());
    }

    /**
     * Метод возвращает количество нанятых рабочих
     * @return количество нанятых рабочих
     */
    public int getCountWorkers(){
        return workers.size();
    }

    /**
     * Метод возвращает количество выпущенных продуктов
     * @return количество выпущенных продуктов
     */
    public int getCountProducts(){
        return products.size();
    }

    /**
     * Метод возвращает количество автомобилей
     * @return количество автомобилей
     */
    public int getAutoCountClass(){
        return Auto.getAutoCount();
    }
}
