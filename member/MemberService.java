package member;

public interface MemberService {
	//1. 회원가입0
	public void join(Member member);
	//2. 로그인0
	public String login(Member member);
	//3. 회원목록0
	public Member[] list();
	//4. 아이디 중복체크0
	public String check(Member member);
	//5. 비번 수정0
	public void edit(Member member);
	//6. 회원탈퇴
	public String remove(Member member);
	//7. 아이디 검색
	public Member[] search(String string);
	//8. 이름 검색
	public Member[] namefind(String name);
	//9. 전체 회원수0
	public int num(Member member);
}
