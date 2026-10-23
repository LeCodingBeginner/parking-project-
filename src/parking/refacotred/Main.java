package parking.refacotred;

import parking.ParkingGarage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] argv){
        // I need to create the parking service and the entities needed:
        List<String> receipts = new ArrayList<>();
        FileLogger logger = new FileLogger("testing.txt");
        ParkingService service = new ParkingService(receipts,0,logger);

        ReportString reportString = new ReportString();

        // I need to have 3 types of tariffs
        CarTariff car = new CarTariff("12345-A-6");
        TruckTariff truck = new TruckTariff("67890-B-1");
        MotorBikeTariff motorBike = new MotorBikeTariff("24680-D-8");

        // I need to pay with two types of payments
        RefundablePayment payment1 = new CardPayment("99994242");
        NonRefundablePayment payment2 = new CashPayment();

        // I need to check out 3 vehicles and refund one
        car.checkout(3,payment1,service,reportString);
        motorBike.checkout(2,payment2,service,reportString);
        truck.checkout(4,payment1,service,reportString);

        car.cancel(3,payment1,service,reportString);


        // I need to print the daily report:
        System.out.println(reportString.report(service.getReceipts(), service.getTotal()));
    }
}
