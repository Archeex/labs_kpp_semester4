package Product;

import sample.Manufacture;

/**
 * Class "Product"
 * Include productName
 */
public class Product extends Manufacture {
    protected String productName;

    /**
     * Constructor of class "Product"
     */
    public Product() {
    }

    /**
     * Constructor with parameters
     * @param type
     */
    public Product(int type){
        switch (type){
            case 1: {
                Match match = new Match();
                productName = "Match";
                break;
            }
            case 2: {
                Pan pan = new Pan();
                productName = "Pan";
                break;
            }
            case 3: {
                Auto auto = new Auto();
                productName = "Auto";
                break;
            }
        }
    }
}
