package sequence;

public class Except3Multi {

	public static void main(String[] args) {
		int[] arr = new int[7];
		int j = 0;
		for(int i = 0; i < 10; i++) {
			int t = i + 1;
			if(t % 3 != 0) {
				arr[j] = t;
				j++;
			} 
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
}
