import java.math.BigDecimal;

public enum Room {
    SINGLE(1, BigDecimal.valueOf(0)),
    STANDARD(2, BigDecimal.valueOf(50)),
    FAMILY(4, BigDecimal.valueOf(200));

    private int amountOfPeople;
    private BigDecimal additionalCost;

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public BigDecimal getAdditionalCost() {
        return additionalCost;
    }

    public void setAdditionalCost(BigDecimal additionalCost) {
        this.additionalCost = additionalCost;
    }

    Room(int amountOfPeople, BigDecimal additionalCost) {
        this.amountOfPeople = amountOfPeople;
        this.additionalCost = additionalCost;
    }
}
