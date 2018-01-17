import java.util.LinkedList;

public class InventoryList {
     LinkedList<BottleObject> workingList = new LinkedList<BottleObject>();

    public void add (BottleObject obj){
        workingList.addLast(obj);
    }

    public BottleObject GetItem(){
        return workingList.getFirst();
    }
    public void ListContents() {
        System.out.println("InventoryList");

//        Figure out tab spacing

        System.out.println("Bottle Information\t\tBarcode\tVolume\t\tSpecificG\t\tTareWeight\t\tCap/Spout");
        workingList.forEach(System.out::println);
//        for (BottleObject item : workingList) {
//            System.out.println(item);
//
//        }
    }
}
