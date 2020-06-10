package test;
import java.util.Scanner;

public class ShopApp{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Shop[] arr = new Shop[3];
		for(int i = 0; i < arr.length; i++) {
			Shop customer = new Shop();
			System.out.println("이름:");
			customer.setName(scanner.next());
			System.out.println("폰가격:");
			customer.setPhone(scanner.nextInt());
			System.out.println("TV가격:");
			customer.setTv(scanner.nextInt());
			System.out.println("컴퓨터가격:");
			customer.setComputer(scanner.nextInt());
			customer.sum();
			arr[i] = customer;
		}
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i].printStates();
		}
	}

}
