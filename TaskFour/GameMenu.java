import java.util.ArrayList;
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

}