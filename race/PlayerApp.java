package race;
import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Player[] race = new Player[3];
		for(int i = 0; i < race.length; i++) {
			Player player = new Player();
			System.out.println("�̸�: ");
			player.setName(scanner.next());
			System.out.println("���: ");
			player.setRecord(scanner.nextInt());
			race[i] = player;
		}
		for(int i = 0; i < race.length; i++) {
			race[i].printStates();
		}
	}

}
