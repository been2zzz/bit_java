package sequence;

public class gg {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int[] arr = new int[100];
		for(i = 0; i < 100; i++) {
			arr[i] = i + 1;
			int j = 0;
			while(true) {
				if(j < arr.length) {
					sum += arr[i];
					j++;
					continue;
				} else {
					break;
				}
			} 
		}
		System.out.println(sum);
	}
}
