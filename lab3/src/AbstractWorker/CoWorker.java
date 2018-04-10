package AbstractWorker;

import sample.Manufacture;

/**
 * Class "CoWorker"
 * Include variables workerName, workerMoney
 */
public class CoWorker extends Manufacture {
    public String workerName;
    private Integer workerMoney;

    /**
     * Constructor of class "CoWorker"
     */
    CoWorker(){
        workerMoney = 0;
        workerName = "";
    }
}
