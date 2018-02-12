import java.io.*;
import java.util.Scanner;


public class Test {

    static File file = new File("itemNames.txt");


    static String names = "\nMilk\nCookies\nToilet paper\nTea\nButter\nCheese\nCola\nBacon\nHam\nWhiskey";

    public static void main(String[] args) throws FileNotFoundException {

        lavStreamNavne(names);


        GroceryList test = new GroceryList();
        GroceryList2 test2 = new GroceryList2();





        GroceryItemOrder Milk = new GroceryItemOrder(2, 12.5,readFile(1) );
        GroceryItemOrder Cookies = new GroceryItemOrder(3, 15.5,readFile(2) );
        GroceryItemOrder ToiletPaper = new GroceryItemOrder(2, 27.5,readFile(3) );
        GroceryItemOrder Tea = new GroceryItemOrder(1,30.75 ,readFile(4) );
        GroceryItemOrder Butter = new GroceryItemOrder(3,11.75 ,readFile(5) );
        GroceryItemOrder Cheese = new GroceryItemOrder(1,45.50 ,readFile(6) );
        GroceryItemOrder Cola = new GroceryItemOrder(2,12.50 ,readFile(7) );
        GroceryItemOrder Bacon = new GroceryItemOrder(4,6.75 ,readFile(8) );
        GroceryItemOrder Ham = new GroceryItemOrder(1,5.50 ,readFile(9) );
        GroceryItemOrder Whiskey = new GroceryItemOrder(1,100 ,readFile(10) );


        test.add(Milk);
        test.add(Cookies);
        test.add(ToiletPaper);
        test.add(Tea);
        test.add(Butter);
        test.add(Cheese);
        test.add(Cola);
        test.add(Bacon);
        test.add(Ham);
        test.add(Whiskey);


        test2.add(Milk);
        test2.add(Cookies);
        test2.add(ToiletPaper);
        test2.add(Tea);
        test2.add(Butter);
        test2.add(Cheese);
        test2.add(Cola);
        test2.add(Bacon);
        test2.add(Ham);
        test2.add(Whiskey);







        //test.getTotalCost();
        //Milk.getCost(Milk);

        //test.add(Milk2);
        // Milk.getCost(Milk);


        // System.out.println(test.totalGroceries);
        // System.out.println(test.getTotalCost());
        System.out.println(test);
        test.getTotalCost();
        System.out.println(test2);
        test2.getTotalCost();
    }

    private static void lavStreamNavne(String itemNames) {
        try {

            File file = new File("itemNames.txt");

            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);


                oos.writeObject(itemNames);


            oos.close();
        } catch (FileNotFoundException eFNFE) {
            System.out.println("Error eFNFE");
            eFNFE.printStackTrace();
        } catch (IOException eIOE) {
            System.out.println("Error eIOE");
            eIOE.printStackTrace();
        }

    }


    public static String readFile(int index) {
        File file = new File("itemNames.txt");

        String line = null;
        for (int i = 0; i < index; i++) {

            try {

                Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));

                    while(i < index) {
                        scanner.nextLine(); // bruges til at skippe linjer
                        i++;
                    }

                while (scanner.hasNextLine()) {



                line = scanner.nextLine();

                    break;
                }
                scanner.close();


            } catch (FileNotFoundException eFNFE) {
                eFNFE.printStackTrace();
            }
            return line;
        }
        return line;
    }


}


