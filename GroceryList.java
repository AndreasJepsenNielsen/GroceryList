import java.util.Arrays;
import java.util.Scanner;

public class GroceryList {
   static Scanner input = new Scanner(System.in);
   int totalGroceries = 0;
   double totalCost = 0.00;

   GroceryItemOrder [] groceryList;
   static final int maxGroceries = 10; // final da der altid vil være højst 10

   public static void main(String[] args) {

        GroceryList test = new GroceryList();

        GroceryItemOrder Milk = new GroceryItemOrder(2,12,"Milk");
      //  GroceryItemOrder Milk2 = new GroceryItemOrder(1,12,"Milk");
       // GroceryItemOrder Milk3 = new GroceryItemOrder(1,12,"Milk");
        test.add(Milk);
       test.add(Milk);
       test.add(Milk);
       test.add(Milk);


        test.createItem2();
        //test.add(Milk2);
       // Milk.getCost(Milk);



      //  System.out.println(test.totalGroceries);
       // System.out.println(test.getTotalCost());
        System.out.println(test);
    }

   public GroceryList()
   {
       groceryList = new GroceryItemOrder[maxGroceries];
   }


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
   public double getTotalCost(){
       for(int count = 0; count < this.totalGroceries; count++){
           totalCost = totalCost + (groceryList[count].getPricePerUnit()*groceryList[count].getQuantity());
       }
       return totalCost;
   }

    public void createItem2()
    {
        GroceryItemOrder grocery = new GroceryItemOrder(
                indtastQuan(),
                indtastPPU(),
                indtastName()
        );
        add(grocery);
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
        String name = input.next(); // blev nød til at gøre det sådan her ellers skippede den navn
        return name;
    }
/*
   private GroceryItemOrder inputItem() {
       System.out.println("Input item");

Random test stuff

       return inputItem();
   }
*/
    @Override
    public String toString() {
        return
             "Grocery List: " +  Arrays.toString(groceryList);
    }
}