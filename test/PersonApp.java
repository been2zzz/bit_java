package test;
import java.util.Scanner;

class PersonApp{
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		Person person = new Person();
		System.out.println("what's your name?");
		person.name = scanner.next();
		System.out.println("How old are you?");
		person.age = scanner.nextInt();
		System.out.println("How tall are you?");
		person.height = scanner.nextFloat();
		person.printStates();
	}
}