package checkout;

public class Receipt {

    private String text = "";

    void scanned(String sku, double price, double discount, String offerText) {
        text += sku + ": " + (int) price;

        if (discount > 0) {
            text += " - " + (int) discount + " (" + offerText + ")";
        }

        text += "\n";
    }


    String text(double total) {
        return text + "Total: " + (int) total;
    }
}