package parking.refacotred;

import java.util.List;

public interface Report {
    // should report have the list of receipts
    public String report(List<String> receipts,double total);
    public String formatReceipt(String vehiclePlate,String vehicleType,int hours,double amount,String pMethType);
}
