
public class Order{
    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private String paymentMethod;
    private PaymentMode paymentMode;
    public Order() {

    }

    public Order(String item, Integer quantity, Double unitPrice, String paymentMethod, PaymentMode paymentMode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = this.unitPrice * this.quantity - (this.unitPrice * this.quantity * paymentMode.determineDiscountRate());
        this.paymentMethod = paymentMethod;
        this.paymentMode = paymentMode;

    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
     this.totalAmount = this.unitPrice * this.quantity - (this.unitPrice* this.quantity * paymentMode.determineDiscountRate());
    }



}
