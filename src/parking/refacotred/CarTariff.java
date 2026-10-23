package parking.refacotred;

public class CarTariff implements TariffVehicle{
    private String plate;
    private String type = "CAR";

    public CarTariff(String plate){
        this.plate = plate;
    }

    public double fee(int hours) {
        return hours*5.0;
    }

    public void checkout(int hours, PaymentMethod pMeth, ParkingService service, Report report) {
        double amount = this.fee(hours);

        pMeth.pay(amount);

        // we need to set the total:
        service.setTotal(amount+service.getTotal());


        // let's add in the receipt:
        service.addReceipt(report.formatReceipt(plate,type,hours,amount,pMeth.getType()));

        // the logging will be handled separately

    }

    public void cancel(int hours, RefundablePayment pMeth, ParkingService service,Report report) {
        double amount = this.fee(hours);
        pMeth.refund(amount);
        service.setTotal(service.getTotal()-amount);
        System.out.println("Refund " + amount + " MAD at the desk for " + plate);
    }


}
