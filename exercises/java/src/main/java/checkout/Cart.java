package checkout;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<String, Integer> cart = new HashMap<>();
    Map<String, Double> prices = new HashMap<>(Map.of(
            "A", 50.0,
            "B", 30.0,
            "C", 20.0,
            "D", 15.0
    ));
    private Receipt receipt = new Receipt();
    public double total = 0;

    public void addItem(String SKU) {
        cart.put(SKU, cart.getOrDefault(SKU, 0) + 1);
        double price = prices.get(SKU);
        int discount = applyDiscounts(SKU);
        total += price + discount;
        receipt.scanned(SKU, price, discount * -1, offerTextFor(SKU));
    }

    public int applyDiscounts(String SKU) {
        int discount = 0;

        if (SKU.equals("A") && cart.get("A") % 3 == 0) {
            discount -= 20;
        }

        if (SKU.equals("B") && cart.get("B") % 2 == 0) {
            discount -= 15;
        }

        return discount;
    }

    private String offerTextFor(String SKU) {
        if (SKU.equals("A") && cart.get("A") % 3 == 0) {
            return "3 for 130";
        }

        if (SKU.equals("B") && cart.get("B") % 2 == 0) {
            return "2 for 45";
        }

        return "";
    }


    public Receipt getReceipt(){
        return receipt;
    }



}



