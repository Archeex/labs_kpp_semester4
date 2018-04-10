package AbstractWorker;

import Product.Match;

/**
 * Class "Worker"
 * Класс хранит имя рабочего и его деньги
 */
public class Worker extends CoWorker {
    /**
     * Конструктор класса обнуляет деньги и имя рабочего
     */
    public Worker(){
    }

    /**
     * Метод отвечает за выполнение труда рабочим
     */
    public void toWork(){
        System.out.println("Worker is work!");
    }

    /**
     * Метод вызывает метод "Зажечь"
     */
    public void toSmoke(){
        toIgnite();
    }

    /**
     * Метод создает экземпляр класса "Спичка" и зажигает её
     */
    public void toIgnite(){
        boolean ifKindle = Match.toKindle();
        if(ifKindle) System.out.println("Kindle!");
    }
}
