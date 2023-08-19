import java.math.BigDecimal;

public enum SeasonPaymentEnum {
    LOW(BigDecimal.valueOf(0)),
    MEDIUM(BigDecimal.valueOf(100)),
    HIGH(BigDecimal.valueOf(250));

    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    SeasonPaymentEnum(BigDecimal price) {
        this.price = price;
    }
}
