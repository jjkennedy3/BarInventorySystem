import java.awt.desktop.SystemEventListener;
import java.util.*;
import static java.lang.Integer.*;

class InputHandler implements Runnable {
    Scanner scanner = new Scanner(System.in);
    //The linked list needs to be abstracted to be usable by the whole application
    LinkedList<BottleObject>BottleList = new LinkedList<BottleObject>();
    InventoryList inventory = new InventoryList();

    public void run(){}
    public void Start() {
        //put a thread start for the reader and writer here and break out the input into a different method or API call
        while (true) {
            clearScreen();
            System.out.println("Enter Barcode:");
            String input = scanner.next().toString();
            System.out.println(input);

            input = input.toLowerCase();

            if (input.equals("q") || input.equals("quit")) {
                System.out.println("exit from handler");
                System.exit(0);
            } else if (input.equals("list")){
                listOutput();
            } else if (input.equals("done")) {
                //OutputHandler out = new OutputHandler(inventory);
                System.out.println("Listing inventory");
            } else {
                int i = parseInt(input);
                BottleObject bottleData = new BottleObject(i);
//                BottleList.add(bottleData);
                inventory.add(bottleData);
            }
        }
    }

    public void listOutput(){
//        System.out.println("InputHandler");
//        System.out.println("Bottle Information\t\tBarcode\tVolume\t\tSpecificG\t\tTareWeight\t\tCap/Spout");
//        for (BottleObject item : BottleList) {
//            System.out.println(item.getInfo());
//            //System.out.println(bottleData.getInfo(123456));
//        }
        inventory.ListContents();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
