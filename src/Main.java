import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ReservationService reservationService = new ReservationServiceImpl();
//        List<Reservation> reservations = new ArrayList<>();
//        Reservation reservation = new Reservation();
//
//        reservationService.addNewReservation(reservations, reservation);
//        System.out.println("Lista po dodaniu: " + reservations);
//
//        reservationService.RemoveReservation(reservations, reservation);
//        System.out.println("Lista po usunięciu: " + reservations);

        ReservationService reservationService = new ReservationServiceImpl();     // wzorzec projektowy dependency injection lub inversion of control
        List<Reservation> list = new ArrayList<>();
        User user = new User("John", "Doe", "john@example.com", "123456789");
        LocalDate holidaysStarts = LocalDate.of(2023,9,16);
        LocalDate holidaysEnds = LocalDate.of(2023,9, 30);

        SeasonPaymentImpl season = new SeasonPaymentImpl();
        season.calculateSeasonPayment(holidaysStarts, holidaysEnds);

        Reservation reservation = new Reservation(user,holidaysStarts,holidaysEnds,BigDecimal.valueOf(200), 3, Room.STANDARD, season);
        reservationService.addNewReservation(list, reservation);
        System.out.println(reservation);












    }

}