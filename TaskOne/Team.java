import java.util.ArrayList;

public class Team{
	
	private String teamName;
	private int rank;
	private ArrayList<String> playerNames = new ArrayList<String>();

	public Team(String teamName){
		this.teamName = teamName;
	}

	public void setRank(int rank){
		this.rank = rank;
	}

	public String toString(){
		String tempString = "";
		for(String S : playerNames){
			tempString += "\n " +S;
		}

		return "team: " + teamName + "\nnumber: " + rank + "\n spillere:" + tempString;
	}

	public void addPlayer(String playerName){
		this.playerNames.add(playerName);

	}




}