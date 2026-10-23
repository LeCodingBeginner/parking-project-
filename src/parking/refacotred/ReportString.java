package parking.refacotred;

import java.util.List;

public class ReportString implements Report{

    public String formatReceipt(String vehiclePlate,String vehicleType,int hours,double amount,String pMethType){
        return vehiclePlate + " | " + vehicleType + " | "
                + hours + " h | " + amount + " MAD | " + pMethType;
    }

    public String report(List<String> receipts,double total) {
        String s = "";
        s+="=== Daily report === \n";
         for (String receipt : receipts){
             s+=receipt + "\n";
         }
         s+="\nTotal : " + total + " MAD";

         return s;
    }
}
