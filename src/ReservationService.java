import java.util.List;

public interface ReservationService {

    void addNewReservation(List<Reservation> currentReservations, Reservation reservation);
    void removeReservation(List<Reservation> currentReservations, Reservation reservation);
}

// Klasa ReservationService definiuje interfejs dla operacji na rezerwacjach,
//  a klasa ReservationServiceImpl dostarcza konkretne implementacje tych operacji.
//  Klasa Reservation reprezentuje dane rezerwacji.

