import java.time.LocalDate;

public interface SeasonPayment {

      SeasonPaymentEnum calculateSeasonPayment(LocalDate startDate, LocalDate endDate);
}
