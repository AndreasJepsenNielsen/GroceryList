public class GroceryItemOrder {
    private int quantity = 0;
    private double pricePerUnit;
    private String itemName;

    public GroceryItemOrder(int quantity, double pricePerUnit, String itemName) {
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
