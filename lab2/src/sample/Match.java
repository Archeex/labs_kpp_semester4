package sample;

/**
 * Class "Match"
 * Класс хранит длину спички и её возможность зажечься
 */
public class Match extends Product{
    private int matchLenght;
    private boolean canKindle;

    /**
     * Конструктор класса обнуляет длину спички и устанавливает возможность зажжения
     */
    public Match(){
        matchLenght = 0;
        canKindle = true;
    }

    /**
     * Метод возвращает состояние, зажглась ли спичка
     * @return состояние спички
     */
    public boolean toKindle(){
        return canKindle;
    }
}
