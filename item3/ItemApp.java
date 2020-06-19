package item3;

import java.util.Scanner;

public class ItemApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Item item = null;
		ItemService itemService =  new ItemServiceImpl();
		while(true) {
		System.out.println("1.ADD 2.LIST 0.END");
			switch(scan.nextInt()) {
			case 0: System.out.println("END"); return;
			case 1:
				System.out.println("ADD");
				item = new Item();
				System.out.println("NAME: ");
				item.setName(scan.next());
				System.out.println("PRICE:");
				item.setPrice(scan.nextInt());
				itemService.addList(item);
				break;
			case 2:
				System.out.println("LIST");
				Item[] list = itemService.list();
				for(int i = 0; i < list.length; i++) {
					System.out.println(list[i].toString());
				}
				break;
			default: System.out.println("잘못된 값 입력");
			}	
		}
	}
}
