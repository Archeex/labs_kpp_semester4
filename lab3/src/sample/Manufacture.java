package sample;

import AbstractWorker.Worker;
import Product.Product;
import Product.Auto;
import Product.Pan;
import Product.Match;

import java.util.ArrayList;

/**
 * Class "Manufacture"
 * Класс Завод, отвечающий за наем рабочих и выпуск продуктов
 */
public class Manufacture {
    private ArrayList<Worker> workers;
    private ArrayList<Product> products;
    private static int productType = 1;

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
     * @param type type of product
     */
    public void makeProduct(int type){
        for(Worker w : workers){
            w.toWork();
            products.add(new Product(type));
        }
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
     * @return workers.size()
     */
    public int getCountWorkers(){
        return workers.size();
    }

    /**
     * Method to change type of product
     * @param type type of product
     */
    public void changeProductTypeInClass(int type){
        productType = type;
    }

    /**
     * Method to get product type
     * @return productType type of product
     */
    public int getProductType(){
        return productType;
    }

    /**
     * Method to get count of Autos
     * @return Auto.getAutoCount()
     */
    public int getAutoCountClass(){
        return Auto.getAutoCount();
    }

    /**
     * Method to get count of Pans
     * @return Pan.getPanCount()
     */
    public int getPanCountClass(){
        return Pan.getPanCount();
    }

    /**
     * Method to get count of Matches
     * @return Match.getMatchCount()
     */
    public int getMatchCountClass(){
        return Match.getMatchCount();
    }
}
