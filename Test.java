import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Test {

    static File file = new File("itemNames.txt");


    static String names = "\nMilk\nCookies\nToilet paper\nTea\nButter\nCheese\nCola\nBacon\nHam\nWhiskey";

    public static void main(String[] args) throws FileNotFoundException {



        File file = new File("itemNames.txt");
        //lavStreamNavne("\nMilk\n","Cookies");
        lavStreamNavne(names);


        GroceryList test = new GroceryList();

        Scanner text = new Scanner(file);



        GroceryItemOrder Milk = new GroceryItemOrder(2, 12,readFile(1) );
        GroceryItemOrder Cookies = new GroceryItemOrder(3, 15,readFile(2) );
        GroceryItemOrder ToiletPaper = new GroceryItemOrder(2, 27,readFile(3) );
        GroceryItemOrder Tea = new GroceryItemOrder(1,30 ,readFile(4) );
        GroceryItemOrder Butter = new GroceryItemOrder(3,11 ,readFile(5) );
        GroceryItemOrder Cheese = new GroceryItemOrder(1,45 ,readFile(6) );
        GroceryItemOrder Cola = new GroceryItemOrder(2,12 ,readFile(7) );
        GroceryItemOrder Bacon = new GroceryItemOrder(4,6 ,readFile(8) );
        GroceryItemOrder Ham = new GroceryItemOrder(1,5 ,readFile(9) );
        GroceryItemOrder Whiskey = new GroceryItemOrder(1,100 ,readFile(10) );

        //  GroceryItemOrder Milk2 = new GroceryItemOrder(1,12,"Milk");
        // GroceryItemOrder Milk3 = new GroceryItemOrder(1,12,"Milk");

        // hvis man prøver at tilføje mere end 10 overrider den bare objekterne, så der
        //Kan tilføjes nye men gamle bliver fjernet.
        // har dog lavet en else sætning som fortæller at indkøbskurven er fuld
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



        //test.getTotalCost();
        //Milk.getCost(Milk);

        //test.add(Milk2);
        // Milk.getCost(Milk);


        //  System.out.println(test.totalGroceries);
        // System.out.println(test.getTotalCost());
        System.out.println(test);
        test.getTotalCost();
    }

    private static void lavStreamNavne(String itemNames) {
        try {

            File file = new File("itemNames.txt");

            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);


                oos.writeObject(itemNames);

              //  oos.writeChars(itemNames2);


            oos.close();
        } catch (FileNotFoundException eFNFE) {
            System.out.println("Error eFNFE");
            eFNFE.printStackTrace();
        } catch (IOException eIOE) {
            System.out.println("Error eIOE");
            eIOE.printStackTrace();
        }

    }

  /*  public static String readFile() {

        String string = new String();

        File file = new File("itemNames.txt");

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String str = sc.nextLine();


            }
        }

        return string + "ane";
    }*/

    public static String readFile(int index) {
        File file = new File("itemNames.txt");

        String line = null;
        for (int i = 0; i < index; i++) {

            try {

                Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));

                    while(i < index) {
                        scanner.nextLine();
                        i++;
                    }



                while (scanner.hasNextLine()) {



                line = scanner.nextLine();

                    //line = scanner.next(Files.readAllLines(Paths.get("itemNames.txt")).get(index));

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


