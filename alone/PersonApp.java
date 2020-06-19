package alone;

import java.util.Scanner;

/* 요구사항 (기능정의)
 * RFP
 * Person(id, pass, name:String) 
 * - Student(ssn:String, score:int)
 * - Admin(rank:int)
 * <사용자기능> Student
 * 1. 회원가입
 * 2. 로그인
 * 3. 비번 수정
 * 4. 회원탈퇴
 * 5. 아이디 존재 체크
 * 6. 마이페이지
 * 7. 점수 입력
 * **********
 * <관리자기능> Admin
 * 1. 회원목록
 * 2. 아이디검색
 * 3. 이름검색
 * 4. 전체 회원수
 * 5. 성적별 현황(스코어 기준 이름 내림차순 ex.1등 이순신(여) 98점)
 */
class Constant{
	public static final String MAN_MENU = "0.종료 1.학생 2.관리자";
	public static final String STUDENT_MENU =  "0.학생 화면 종료\n1. 회원가입\n2. 로그인\n3. 비번 수정\n4. 회원탈퇴\n5. 아이디 존재 체크\n6. 마이페이지\n7. 점수 입력";
	public static final String ADMIN_MENU = "0.관리자 화면 종료\n1. 회원목록\n" + 
			"2. 아이디검색\n" + 
			"3. 이름검색\n" + 
			"4. 전체 회원수\n" + 
			"5. 성적별 현황\n";
	public static final String PERSON_SPEC ="아이디: %s 비번: %s 이름: %s";
	public static final String ADMIN_SPEC ="아이디: %s 비번: %s 이름: %s 주민번호(%s) %s 점수: %s";
	public static final String STUDENT_SPEC ="아이디: %s 비번: %s 이름: %s 등급: %s";
}
class Person{
	protected String id, pw, name;
	public String getId() {return id;}
	public void setId(String userid) {this.id = userid;}
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String toString() {
		return String.format("아이디: %s 비번: %s 이름: %s", id, pw, name);
	}
}
class Student extends Person{
	private String ssn, gender; private int score;
	public String getSsn() {return ssn;}
	public void setSsn(String ssn) {this.ssn = ssn;}
	public int getScore() {return score;}
	public void setScore(int score) {this.score = score;}
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public String toString() {
		return String.format("아이디: %s 비번: %s 이름: %s 주민번호(%s) %s 점수: %s", id, pw, name, gender, ssn, score);
	}
}
class Admin extends Person{
	private int rank;

	public int getRank() {return rank;}
	public void setRank(int rank) {this.rank = rank;}
	public String toString() {
		return String.format("관리자 아이디: %s 비번: %s 이름: %s 등급: %s", id, pw, name, rank);
	}

}
public class PersonApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Admin admin = null;
		Student student = null;
		PersonService service =  new PersonServiceImpl();
		while(true) {
			System.out.println(Constant.MAN_MENU);
			switch(scan.nextInt()) {
			case 0: return;
			case 1: student(scan, student, service);break;
			case 2: admin(scan,student, service);break;
			default: System.out.println("다시 입력");
			}
		}
	}


	public static void student(Scanner scan, Student student, PersonService service) {
		System.out.println("사용자 기능");
		System.out.println(Constant.STUDENT_MENU);
		String result = "";
		switch(scan.nextInt()) {
		case 0: return;
		case 1:
			System.out.println("Sign up");
			student = new Student();
			System.out.println("ID:");
			student.setId(scan.next());
			System.out.println("PW: ");
			student.setPw(scan.next());
			System.out.println("NAME: ");
			student.setName(scan.next());
			System.out.println("BIRTH: ");
			student.setSsn(scan.next());
			service.join(student);
			break;
		case 2:
			System.out.println("Login");
			student = new Student();
			System.out.println("ID:");
			student.setId(scan.next());
			System.out.println("PW: ");
			student.setPw(scan.next());
			result = service.login(student);
			System.out.println(result);
			break;
		case 3:
			System.out.println("edit");
			student = new Student();
			System.out.println("아이디 입력:");
			student.setId(scan.next());
			System.out.println("변경할 비밀번호 입력:");
			student.setPw(scan.next());
			result = service.edit(student);
			System.out.println(result);
			break;
		case 4:
			System.out.println("회원탈퇴");
			student = new Student();
			System.out.println("탈퇴할 아이디 입력:");
			student.setId(scan.next());
			System.out.println("비밀번호 입력:");
			student.setPw(scan.next());
			result = service.remove(student);
			System.out.println(result);
			break;
		case 5:
			System.out.println("아이디 존재 체크");
			student = new Student();
			System.out.println("가입하고자 하는 아이디 입력:");
			student.setId(scan.next());
			result = service.check(student);
			System.out.println(result);
			break;
		case 6:
			System.out.println("마이페이지");
			student = new Student();
			System.out.println("ID:");
			student = service.mypage(scan.next());
			System.out.println(student.toString());
			break;
		case 7:
			System.out.println("점수입력");
			student = new Student();
			System.out.println("ID:");
			student.setId(scan.next());
			System.out.println("PW: ");
			student.setPw(scan.next());
			System.out.println("Score: ");
			service.inputScore(student);
			break;
		default: System.out.println("다시 입력");
		break;
		}
	}
	private static void admin(Scanner scan, Student student, PersonService service) {
		System.out.println("관리자기능");
		System.out.println(Constant.ADMIN_MENU);
		switch(scan.nextInt()) {
		case 0: return;
		case 1:
			System.out.println("회원목록");
			Student[] list = service.list();
			for(int i = 0; i < 3;i++) {
				System.out.println(list[i]);
			}
			break;
		case 2:
			System.out.println("아이디 검색");
			student = new Student();
			student = service.idfind(scan.next());
			System.out.println(student.toString());
			break;
		case 3:
			System.out.println("이름 검색");break;
		case 4:
			System.out.printf("전체 회원수 %d명\n",service.num());
			break;
		case 5:
			System.out.println("성적별 현황");break;
		default: 
			System.out.println("다시 입력");
			break;
		}
	}
}
interface PersonService{
	//**사용자 기능
	//1.회원가입
	public void join(Student student);
	//2.로그인
	public String login(Student student);
	//3.비번수정
	public String edit(Student student);
	//4.회원탈퇴
	public String remove(Student student);
	//5.아이디 존재체크
	public String check(Student student);
	//6.마이페이지
	public Student mypage(String id);
	//7.점수입력
	public void inputScore(Student student);

	//**관리자기능
	//1.회원목록
	public Student[] list();
	//2.아이디 검색
	public Student idfind(String id);
	//3.이름 검색
	public Person[] namefind();
	//4.전체 회원수
	public int num();
	//5.성적별 현황
	public Person[] rank();

}
class PersonServiceImpl implements PersonService{
	private int count;
	private Student[] students;
	Scanner scan = new Scanner(System.in);

	public PersonServiceImpl() {
		students = new Student[3];
		count = 0;
	}


	@Override //회원가입
	public void join(Student student) {
		String gender = student.getSsn();
		String result = "";
		switch(gender.charAt(7)) {
		case'1':case'3': result = "남"; break;
		case'2':case'4': result = "여"; break;
		default: result = "오류";break;
		}
		student.setGender(result);
		students[count] = student;
		count++;
	}

	@Override //로그인
	public String login(Student student) {
		String result = "로그인 실패";
		for(int i = 0; i < students.length; i++) {
			if(student.getId().equals(students[i].getId())
					&&
					student.getPw().equals(students[i].getPw())) {
				result = "로그인 성공";
				break;
			}
		}
		return result;
	}

	@Override //비밀번호 수정
	public String edit(Student student) {
		String result = "수정 실패";
		for(int i = 0; i < count ; i++) {
			if(student.getId().equals(students[i].getId())) {
				students[i].setPw(student.getPw());
				result = "수정 성공";
				break;
			}
		}
		return result;

	}

	@Override //탈퇴
	public String remove(Student student) {
		String result = "탈퇴 실패";
		for(int i = 0; i < count; i++) {
			if(student.getId().equals(students[i].getId())
					&&
					student.getPw().equals(students[i].getPw())) {
				students[i] = students[count - 1];
				students[count - 1] = null;
				count --;
				result = "탈퇴 완료";
				break;
			}
		}
		return result;
	}

	@Override //아이디 중복 체크
	public String check(Student student) {
		String result = "사용가능한 아이디입니다";
		for(int i = 0;i < count; i++) {
			if(student.getId().equals(students[i].getId())) {
				result = "사용 불가능한 아이디입니다";
				break;
			}
		}
		return result;
	}

	@Override //마이페이지
	public Student mypage(String id) {
		Student student = new Student();
		for(int i = 0; i < count;i++) {
			if(id.equals(students[i].getId())
					){
				student = students[i];
				break;
			}
		}
		return student;
	}

	@Override //회원목록
	public Student[] list() {
		return students;
	}

	@Override //id 검색
	public Student idfind(String id) {
		Student student = new Student();
		for(int i = 0; i <students.length; i++) {
			if(id.equals(students[i].getId())) {
				student = students[i];
			}
		}
		return student;
	}

	@Override //이름검색
	public Student[] namefind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override //회원수
	public int num() {
		return count;
	}

	@Override
	public Student[] rank() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override //점수 입력
	public void inputScore(Student student) {
		for(int i = 0; i < count; i++) {
			if(student.getId().equals(students[i].getId())
					&&
					student.getPw().equals(students[i].getPw())) {
				students[i].setScore(scan.nextInt());
			}
		}
	}
}