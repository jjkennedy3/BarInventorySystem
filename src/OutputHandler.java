import java.io.BufferedWriter;
import java.nio.file.FileSystem;
import java.util.LinkedList;

class OutputHandler implements Runnable{

    public void run(){

    }
    public void processOutput(LinkedList<BottleObject> inventoryList) {
        for (BottleObject item : inventoryList) {
            addToDataSource();
        }
    }

    private void addToDataSource(){

    }
}
