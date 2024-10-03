import java.util.ArrayList;
import java.util.Scanner;
public class GameMenu {

    ArrayList<String> actions = new ArrayList<>();


    public GameMenu(ArrayList<String> actions){
        this.actions = actions;
    }

    public void displayMenu(){
        for (String tempString : actions){
            System.out.println(tempString);
        }
    }

    public String getAction(){
        System.out.println("Type a number to choose an action");
        displayMenu();

        Scanner scan = new Scanner(System.in);
        String Choice = scan.nextLine();
        return Choice;
    }

}