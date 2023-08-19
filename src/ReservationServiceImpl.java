import java.util.List;

public class ReservationServiceImpl implements ReservationService {


    @Override
    public void addNewReservation(List<Reservation> currentReservations, Reservation reservation) {
        currentReservations.add(reservation);
    }

    @Override
    public void removeReservation(List<Reservation> currentReservations, Reservation reservation) {

    }
}
