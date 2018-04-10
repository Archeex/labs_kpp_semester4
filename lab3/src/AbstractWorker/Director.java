package AbstractWorker;

/**
 * Class "Director"
 * Include method to change type of Products
 */
public class Director extends CoWorker {
    /**
     * Method change type of Products
     * @param type
     */
    private void changeProductType(int type){
        changeProductTypeInClass(type);
    }
}
