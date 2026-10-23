package parking.refacotred;

import java.util.ArrayList;
import java.util.List;

public class ParkingService {
    private List<String> receipts = new ArrayList<>();
    private double total;
    private LoggerMethod logger;

    public ParkingService(List<String> receipts, double total, LoggerMethod logger){
        this.receipts = receipts;
        this.total = total;
        this.logger = logger;
    }

    public double getTotal() {
        return total;
    }

    public List<String> getReceipts() {
        return receipts;
    }

    public void setTotal(double total){
        this.total = total;
    }

    public void addReceipt(String receipt){
        receipts.add(receipt);
        logger.log(receipt);
    }

}
