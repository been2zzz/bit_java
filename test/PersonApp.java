package test;
import java.util.Scanner;

class PersonApp{
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		Person person = new Person();
		System.out.println("이름이 뭔가요?");
		person.name = scanner.next();
		System.out.println("몇살인가요?");
		person.age = scanner.nextInt();
		System.out.println("키가 몇인가요?");
		person.height = scanner.nextFloat();
		person.printStates();
	}
}