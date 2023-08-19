import java.math.BigDecimal;
import java.time.LocalDate;

public class Reservation {

    private BigDecimal priceForNight;
    private int numberOfNights;
    private Room typeOfRoom;
    private SeasonPaymentEnum seasonPayment;
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;

    private SeasonPayment payment;



    public BigDecimal getPriceForNight() {
        return priceForNight;
    }

    public void setPriceForNight(BigDecimal priceForNight) {
        this.priceForNight = priceForNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public Room getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(Room typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public SeasonPaymentEnum getSeasonPayment() {
        return seasonPayment;
    }

    public void setSeasonPayment(SeasonPaymentEnum seasonPayment) {
        this.seasonPayment = seasonPayment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Reservation(User user, LocalDate startDate, LocalDate endDate, BigDecimal priceForNight, int numberOfNights, Room typeOfRoom, SeasonPaymentEnum additionalPayment) {
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceForNight = priceForNight;
        this.numberOfNights = numberOfNights;
        this.typeOfRoom = typeOfRoom;
        this.seasonPayment = payment.calculateSeasonPayment(startDate, endDate);

    }
    public BigDecimal calculateTotalPrice(){

        BigDecimal totalPrice = priceForNight.multiply(BigDecimal.valueOf(numberOfNights)).add(typeOfRoom.getAdditionalCost()).add(seasonPayment.getPrice());
        return totalPrice;

    }

    @Override
    public String toString() {
        return "Reservation{" +
                "totalPrice=" + calculateTotalPrice() +
                ", numberOfNights=" + numberOfNights +
                ", typeOfRoom=" + typeOfRoom +
                ", seasonPayment=" + seasonPayment +
                ", user=" + user +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}

