package member;

import java.util.Scanner;

public class MemberApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			System.out.println("메뉴: 0.종료 1.회원가입 2.로그인 3.회원목록 4.아이디 중복체크"
					+ " 5.비번 수정 6.회원탈퇴 7.아이디검색 8.이름 검색 9.전체회원수");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1 : //회원가입
				System.out.println("회원가입"); 
				member = new Member();
				System.out.println("아이디: ");
				member.setUserid(scanner.next());
				System.out.println("비밀번호: ");
				member.setPassword(scanner.next());
				System.out.println("이름: ");
				member.setName(scanner.next());
				memberService.join(member);
				break;
			case 2 : //로그인
				System.out.println("로그인");
				member = new Member();
				System.out.println("id: ");
				member.setUserid(scanner.next());
				System.out.println("pw: ");
				member.setPassword(scanner.next());
				String result = memberService.login(member);
				System.out.println(result);
				break;
			case 3 : //회원목록
				Member[] list = memberService.list();
				for(int i = 0; i < 3; i++) {
					System.out.println(list[i]);
				}
				break;
			case 4: //아이디 중복체크
				System.out.println("아이디 존재 확인");
				member = new Member();
				System.out.println("아이디 입력: ");
				member.setUserid(scanner.next());
				result = memberService.check(member);
				System.out.println(result);
				break;
			case 5: //비밀번호변경
				System.out.println("비밀번호 변경");
				member = new Member();
				System.out.println("아이디 입력: ");
				member.setUserid(scanner.next());
				System.out.println("변경할 비밀번호 입력: ");
				member.setPassword(scanner.next());
				memberService.edit(member);
				break;
			case 6: //탈퇴
				System.out.println("회원 탈퇴");
				member = new Member();
				System.out.println("탈퇴 아이디 입력: ");
				member.setPassword(scanner.next());
				System.out.println("비번 입력:");
				member.setPassword(scanner.next());
				memberService.remove(member);
				result = memberService.remove(member);
				System.out.println(result);
				break;
			case 7 : //아이디검색
				System.out.println("아이디 검색");
				Member[] found = memberService.search(scanner.next());
				System.out.println(member.toString());
				break;
			case 8: //이름검색
				System.out.println("이름 검색");
				Member[] namefind = memberService.namefind(scanner.next());
				for(Member m: namefind) {
					System.out.println(m.toString());
				}
				break;
			case 9: //회원수 확인
				member = new Member();
				System.out.println("회원수 확인");
				System.out.println(memberService.num(member));
				break;
			default: 
				System.out.println("없는 기능입니다."); 
				break;
			}
		}
	}
}
