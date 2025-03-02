package InterfaceExample.src.model.entities;

import java.time.LocalDateTime;

public final class CarRental {
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    private Vehicle vehicle;
    private Invoice invoice; // Invoice will be created later on

    public CarRental() {
    }

    public CarRental(LocalDateTime startTime, LocalDateTime finishTime, Vehicle vehicle) {
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
