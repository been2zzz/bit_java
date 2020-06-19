package matrix;

public class Gugudan1 {

	public static void main(String[] args) {
		for(int j = 1; j < 10; j++) {
			for(int i = 2; i < 6; i ++) {
				System.out.printf("%d X %d = %d\t",i ,j ,i * j);
			}
			System.out.println();
		}
		System.out.println();
		for(int j = 1; j < 10; j++) {
			for(int i = 6; i < 10; i ++) {
				System.out.printf("%d X %d = %d\t",i ,j ,i * j);
			}
			System.out.println();
		}
	}
}
