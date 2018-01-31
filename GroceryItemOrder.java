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
//methods

    /*
    public GroceryItemOrder createItem(int quantity, double pricePerUnit, String itemName){
        this.quantity = input.nextInt();
        this.pricePerUnit = input.nextDouble();
        this.itemName = input.nextLine();
        GroceryItemOrder ting = new GroceryItemOrder(quantity,pricePerUnit,itemName);
        return ting;
    }
*/
    // få mægnde og prisen i forhold til mængde
    public void getCost(GroceryItemOrder item)
    {

        System.out.println("Quantity:"+(item.getQuantity()) + " Price: " + item.pricePerUnit * quantity);
    }



    @Override
    public String toString() {
        return  "\n Grocery name: " + itemName
                +"\n quantity =" + quantity +
                "\n price per unit :" + pricePerUnit +
                "\n";
    }
}
