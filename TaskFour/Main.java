import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> menuOptions = new ArrayList<>();
        menuOptions.add("1) Start game");
        menuOptions.add("2) Resume game");
        menuOptions.add("3) Pause game");
        menuOptions.add("4) End game");

        GameMenu menu = new GameMenu(menuOptions);
        menu.displayMenu();
    }
}