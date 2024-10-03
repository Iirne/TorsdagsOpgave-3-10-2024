public class Main{
	


	public static void main(String[] args){
		Team T1 = new Team("Team1");

		T1.setRank(4);

		System.out.println(T1.toString());

		Team T2 = new Team("Team");

		T2.setRank(5);

		System.out.println(T2.toString());

		Team T3 = new Team("winners");

		T3.setRank(2);

		System.out.println(T3.toString());

		Team T4 = new Team("Hustler One");

		T4.setRank(1);

		System.out.println(T4.toString());

		Team T5 = new Team("Runner Up");

		T5.setRank(3);

		System.out.println(T5.toString());

		Team T6 = new Team("Nineball");

		T6.setRank(9);

		System.out.println(T6.toString());
	}
}