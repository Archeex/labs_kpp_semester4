package sample;

import java.util.Random;

/**
 * Class "Auto"
 * Класс хранит модель автомобиля и их количество
 */
public class Auto extends Product{
    String[] models = {"Opel", "Pontiac", "Ford", "Skoda", "Bmw", "Rolls", "Porsche",};
    private String autoModel;
    public static int autoCount = 0;

    /**
     * Конструктор класса устанавливает рандомную марку и увеличивает количество автомобилей
     */
    public Auto(){
        Random rand = new Random();
        autoModel = models[rand.nextInt(7)];
        autoCount++;
        System.out.println("Car model: " + autoModel);
    }

    /**
     * Метод отвечает за движение автомобиля
     */
    public void drive() {
        System.out.println("Car is drive!");
    }

    /**
     * Метод возвращает количество автомобилей
     * @return количество автомобилей
     */
    public static int getAutoCount(){
        return autoCount;
    }
}
