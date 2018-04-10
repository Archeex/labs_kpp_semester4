package sample;

/**
 * Class "Worker"
 * Класс хранит имя рабочего и его деньги
 */
public class Worker {
    private String workerName;
    private Integer workerMoney;

    /**
     * Конструктор класса обнуляет деньги и имя рабочего
     */
    public Worker(){
        workerMoney = 0;
        workerName = "";
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
        Match match = new Match();
        boolean ifKindle = match.toKindle();
        if(ifKindle) System.out.println("Kindle!");
    }
}
