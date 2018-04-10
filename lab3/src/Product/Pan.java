package Product;

/**
 * Class "Pan"
 * Include volume of pan and count of pans
 */
public class Pan extends Product {
    public int volume;
    public static int panCount = 0;

    /**
     * Constructor of class "Pan"
     */
    public Pan(){
        panCount++;
        System.out.println("Pan created!");
    }

    /**
     * Method to get count of pans
     * @return panCount
     */
    public static int getPanCount(){
        return panCount;
    }
}
