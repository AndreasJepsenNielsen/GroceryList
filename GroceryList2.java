import java.util.ArrayList;

public class GroceryList2 {

private ArrayList<GroceryItemOrder> groceryList;
private int totalGroceries = 0;
private int maxGroceries = 10;

    public GroceryList2(ArrayList<GroceryItemOrder> groceryList) {
        this.groceryList = groceryList;
    }

    private double totalCost = 0.00;


public GroceryList2(){this.groceryList = new ArrayList<>(maxGroceries);}

    public void getTotalCost(){
        for(int count = 0; count < this.totalGroceries; count++){
            totalCost = totalCost + (groceryList.get(count).getPricePerUnit()*groceryList.get(count).getQuantity());
        }
        System.out.println(totalCost + " DKK");
    }

    public String toString(){
        String item = "";
        for (int i = 0; i < totalGroceries; i++) {
            item += this.groceryList.get(i).toString();
        }
        return item;
    }

    public void add(GroceryItemOrder grocery)
    {
        if(totalGroceries < maxGroceries) {
            groceryList.add(grocery);
            totalGroceries++;
        }else{
            System.out.println("List is full");

        }
    }




}
