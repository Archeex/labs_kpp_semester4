package Product;

/**
 * Class "Match"
 * Класс хранит длину спички и её возможность зажечься
 */
public class Match extends Product{
    public int matchLength;
    public static boolean canKindle;
    public static int matchCount = 0;

    /**
     * Конструктор класса обнуляет длину спички и устанавливает возможность зажжения
     */
    public Match(){
        matchLength = 0;
        canKindle = true;
        System.out.println("Match created!");
        matchCount++;
    }

    /**
     * Метод возвращает состояние, зажглась ли спичка
     * @return состояние спички
     */
    public static boolean toKindle(){
        return canKindle;
    }

    public static int getMatchCount() {
        return matchCount;
    }
}
