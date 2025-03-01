package CustomExceptionExample.src.model.entities;

import CustomExceptionExample.src.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
        this.roomNumber = roomNumber;
        validateDates(checkIn, checkOut);
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    // Validates a inputted date, throws an exception if any of the dates is invalid
    public void validateDates(Date checkIn, Date checkOut) throws DomainException {
        Date now = new Date();
        // If any of the dates is before today
        if (checkIn.before(now) || checkOut.after(now)) {
            throw new DomainException("Reservation dates must be future dates!");
        }

        // If the checkout is before checkin
        if (checkOut.before(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date!");
        }
    }

    public long duration(){
        long difference = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException {
        validateDates(checkIn, checkOut);
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", Check In: "
                + dateFormat.format(checkIn)
                + ", Check Out: "
                + dateFormat.format(checkOut)
                + ", Duration: "
                + duration()
                + " nights.";
    }
}
