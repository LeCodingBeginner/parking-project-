package parking.refacotred;

public interface TariffVehicle {
    public double fee(int hours);
    public void checkout(int hours,PaymentMethod pMeth,ParkingService service,Report report);
    public void cancel(int hours, RefundablePayment pMeth, ParkingService service,Report report);
}
