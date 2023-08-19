import java.time.LocalDate;

public class SeasonPaymentImpl implements SeasonPayment{

    @Override
    public SeasonPaymentEnum calculateSeasonPayment(LocalDate startDate, LocalDate endDate) {

        LocalDate summerStart = LocalDate.of(startDate.getYear(), 6, 1);
        LocalDate summerEnd = LocalDate.of(startDate.getYear(), 8, 31);

        if (startDate.isAfter(summerStart) && endDate.isBefore(summerEnd)) {
            return SeasonPaymentEnum.HIGH;
        } else if (startDate.isAfter(summerStart) || endDate.isBefore(summerEnd)) {
            return SeasonPaymentEnum.MEDIUM;
        } else {
            return SeasonPaymentEnum.LOW;
        }
    }
}
