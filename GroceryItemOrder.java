import java.util.Scanner;

public class GroceryItemOrder {

//Fields
    Scanner input = new Scanner(System.in);
    private int quantity = 1;
    private double pricePerUnit;
    private String itemName;
//constructor


    public GroceryItemOrder(int quantity, double pricePerUnit, String itemName) {
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.itemName = itemName;
    }
// getters and setters
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
//methods og diverse

    // få mængde og prisen i forhold til mængde
    public void getCost(GroceryItemOrder item)
    {
        System.out.println("Quantity: "+(item.getQuantity()) + " Price: " + item.pricePerUnit * quantity);
    }


    public int indtastQuan()
    {
        System.out.println("Input quantity: ");

        return input.nextInt();
    }

    public double indtastPPU()
    {
        System.out.println("Input price per unit: ");
        return input.nextDouble();
    }

    public String indtastName()
    {
        System.out.println("Input item name: ");
        String name = input.next();
        return name;
    }

    @Override
    public String toString() {
        return  "\n Grocery name: " + itemName
                +"\n quantity = " + quantity +
                "\n Price : " + (pricePerUnit*quantity) +
                "\n";
    }
}
