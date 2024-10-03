import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> menuOptions = new ArrayList<>();
        menuOptions.add("1) Start game");
        menuOptions.add("2) Resume game");
        menuOptions.add("3) Pause game");
        menuOptions.add("4) End game");

        GameMenu menu = new GameMenu(menuOptions);
        //if the input is a string of numbers it will cause errors
        String response = menu.getAction();
        doAction(Integer.parseInt(response));

    }

    public static void doAction(int action){
        switch (action){
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break; 
            case 4:
                System.out.println("Ending game");
                break;    
        }

    }
}