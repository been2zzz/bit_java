package item3;

public class ItemServiceImpl implements ItemService {
	private Item[] list;
	private int index;
	
	public ItemServiceImpl() {
		list = new Item[3];
		index = 0;
	}

	@Override
	public void addList(Item item) {
		list[index] = item;
		index++;
	}

	@Override
	public Item[] list() {
		return list;
	}
}
