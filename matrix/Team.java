package matrix;

public class Team {

	public static void main(String[] args) {
		String[] team1 = {"길동","순신","강참","철수"}; 
		String[] team2 = {"톰","제임스","칼","로빈"}; 
		String[] team3= {"제이콥","기호","승아","태빈"}; 
		String[] team4 = {"동준","로미","길수","영희"}; 
		String[][] teams = {team1, team2, team3, team4};
		for(int i = 0; i < teams.length; i++) {
			for(int j = 0; j < teams[i].length; j++) {
				System.out.printf("%s\t",teams[i][j]);
			}
			System.out.println();
		}
	}
}
