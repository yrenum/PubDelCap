import menu.Food;
import menu.entries.MenuEntry;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        Pub pub = new Pub(false);

        Food.newMenu();
        Food.addCategory("Panini");
        
        MenuEntry bigMac = new MenuEntry(5, "BigMac");
        Food.addEntry("Panini", bigMac);
        try {
            Food.saveFood("food.menu");
            pub.occupyTable(1);


        } catch (Exception e){
            System.out.println(e);
        }
    }
}
