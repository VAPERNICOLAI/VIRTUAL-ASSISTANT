import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private int invoiceId;
    private int clientId;
    private String invoiceDate;
    private double total;
    private double tax;
    private List<InvoiceItem> items;

    public Invoice(int clientId) {
        this.clientId = clientId;
        this.items = new ArrayList<>();
    }

    public void addItem(InvoiceItem item) {
        items.add(item);
        total += item.getTotal();
    }
}
