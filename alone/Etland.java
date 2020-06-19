package alone;

import java.util.Scanner;

/**
@author been2zz@naver.com
@since 2020.06.18
@param kind 종류, company 제조사, call 통화내역
 */
class Product{
}
class TV extends Product{
	public final static String KIND = "TV"; 
	@Override public String toString() {return String.format("%s", KIND);
	}
}
class ColorTv extends TV{
	public final static String KIND = "컬러TV";
	@Override
	public String toString() {
		return String.format("%s", KIND);
	}
}
class Computer extends Product{
	public final static String KIND = "컴퓨터"; 
	@Override
	public String toString() {
		return String.format("%s", KIND);
	}
}
class Notebook extends Computer{
	public final static String KIND = "노트북"; 
	@Override
	public String toString() {
		return String.format("%s", KIND);
	}
}
class Iphone extends Product{
	public final static String KIND = "아이폰";
	@Override
	public String toString() {
		return String.format("%s", KIND);
	}
}
class Galphone extends Iphone{
	public final static String KIND = "갤럭시";
	@Override
	public String toString() {
		return String.format("%s",KIND);
	}
}

public class Etland extends Object{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product item = null;
		Product[] cart = new Product[5];
		int index = 0;
		while(true) {
			System.out.println("쇼핑목록: 0.종료 1.아이폰 2.갤럭시 3.컬러TV 4.컴퓨터 5.노트북 6.쇼핑목록보기");
			switch(scanner.nextInt()) {
			case 0: return;
			case 1: cart[index] = new Iphone(); index++; break;			
			case 2: cart[index] = new Galphone(); index++; break;
			case 3: cart[index] = new ColorTv(); index++; break;
			case 4: cart[index] = new Computer(); index++; break;
			case 5: cart[index] = new Notebook(); index++; break;
			case 6: 
				System.out.println("구매목록");
				for(Product p : cart) {
					System.out.println(p.toString());
				}
				break;
			default:
				break;
			}
		}
	}
}



