import jdk.jshell.spi.ExecutionControl;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Inventory System!");
        InputHandler handler = new InputHandler();
        handler.Start();
        System.out.println("exit from main");
    }
}
