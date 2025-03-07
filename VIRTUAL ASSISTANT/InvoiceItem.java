public class InvoiceItem {
    private int serviceId;
    private double hours;
    private double total;

    public InvoiceItem(int serviceId, double hours, double total) {
        this.serviceId = serviceId;
        this.hours = hours;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
