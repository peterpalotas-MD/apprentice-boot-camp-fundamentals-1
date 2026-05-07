package checkout;

class Checkout {
    private int total;

    Cart cart = new Cart();
    void scan(String sku) {

        cart.addItem(sku);

    }

    int total() {
        return (int)cart.total;
    }

    public String receipt() {
        return cart.getReceipt().text(cart.total);
    }
}
