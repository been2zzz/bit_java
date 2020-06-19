package phone;

import java.util.Scanner;

/**
@author been2zz@naver.com
@since 2020.06.18
@param kind 종류, company 제조사, call 통화내역
 */
class Belphone{
	protected String kind, company, call;
	public String getKind() {return kind;}
	public void setKind(String kind) {this.kind = kind;}
	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;}
	public String getCall() {return call;}
	public void setCall(String call) {this.call = call;}
	@Override
	public String toString() {
		return "집전화기 [폰종류=" + kind + ", 제조사=" + company + ", 통화내역=" + call + "]";
	}
}
class Celphone extends Belphone{
	public final static String KIND = "휴대폰"; //상수
	protected boolean portable;                //변수
	protected String move;
	
	public boolean isPortable() {return portable;}
	public void setPortable(boolean portable) {
		move = (portable)? "이동중에":"이동불가능";
		this.portable = portable;
		}
	public String getMove() {return move;}
	public void setMove(String move) {this.move = move;}
	@Override
	public String toString() {
	return String.format("%s인 %s제품을 사용해서 %s 라고 %s 통화한다",KIND ,super.company, super.call, move);
	}
}
class Iphone extends Celphone{
	public final static String KIND = "아이폰";
	protected String search;
	public String getSearch() {return search;}
	public void setSearch(String search) {this.search = search;}
	public String toString() {
		return String.format("%s %s을 사용해서 %s %s을 한다",super.company, KIND ,move , search);
	}
}
class Galphone extends Iphone{
	protected String pay;
	public final static String KIND = "갤럭시";
	public String getPay() {return pay;}
	public void setPay(String pay) {this.pay = pay;}
	public String toString() {
		return String.format("%s %s 제품을 사용해서, %s %s 한다", company, KIND, move , pay);
	}
}

public class Phone extends Object{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Belphone[] arr = new Belphone[1];
		Belphone phone = null; //디스크상 존재
		Celphone cel = null;
		Iphone ip = null;
		Galphone gp = null;
		while(true) {
			System.out.println("0.종료 1.집전화걸기 2.전화받기 3.휴대폰걸기 4.아이폰서치 5.삼성페이결제");
			switch(scanner.nextInt()) {
			case 0: return;
			case 1: 
				phone = new Belphone(); //메모리(RAM)에 존재
				phone.setKind("집전화");
				phone.setCompany("금성사");
				phone.setCall("안녕하세요.");
				arr[0] = phone;
				break;
			case 2: 
				System.out.println(arr[0].toString());
			case 3:
				cel = new Celphone();
				cel.setCompany("노키아");
				cel.setPortable(true);
				cel.setCall("통화하고 있다.");
				arr[0] = cel;
				break;
			case 4:
				ip = new Iphone();
				ip.setCompany("애플");
				ip.setPortable(true);
				ip.setSearch("뉴스 검색");
				arr[0] = ip;
				break;
			case 5:
				gp = new Galphone();
				gp.setCompany("삼성");
				gp.setPortable(true);
				gp.setPay("삼성페이 결제");
				arr[0] = gp;
				break;
			default:
				break;
			}
		}
	}
}

