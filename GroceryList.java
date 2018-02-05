import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
    // fields
   static Scanner input = new Scanner(System.in);
   private int totalGroceries = 0;
   private double totalCost = 0.00;

   GroceryItemOrder [] groceryList;
   final int maxGroceries = 10; // final da der altid vil være højst 10

   public static void main(String[] args) {


    }
// constructor
   public GroceryList()
   {
       groceryList = new GroceryItemOrder[10];
   }

// metoder++
// Tilføj grocery til listen, hvis listen er fuld får vi en besked om at listen er full og der bliver ikke tilføjet noget
   public void add(GroceryItemOrder grocery){
       if(totalGroceries < maxGroceries){
           groceryList[this.totalGroceries] = grocery;
           ++totalGroceries;
       }else{
           System.out.println("Grocery list is full!");
       }
   }
// få total kost for alle groceries i listen
   public void getTotalCost(){
       for(int count = 0; count < this.totalGroceries; count++){
           totalCost = totalCost + (groceryList[count].getPricePerUnit()*groceryList[count].getQuantity());
       }
       System.out.println(totalCost);
   }
// to string
   /* @Override
    public String toString() {
        return
             "Grocery List: " +  Arrays.toString(groceryList);
    }
    */
    public String toString(){
       String item = "";
        for (int i = 0; i < totalGroceries; i++) {
            item += this.groceryList[i].toString();

        }
        return item;
    }
}