package member;

public class MemberServiceImpl implements MemberService {
	private Member[] members; //field 값을 넣으면 고정됨
	private int idx; //field 값을 넣으면 고정됨
	
	public MemberServiceImpl() {
		members = new Member[3];
		idx = 0;
	}
	
	@Override
	public void join(Member member) { //setter
		System.out.println("App에서 넘어온 회원정보");
		System.out.println(member.toString());
		members[idx] = member;
		idx++;
		System.out.println("증가된 인덱스 값: " + idx);
		System.out.println("배열에 저장된 회원정보");
		for(int i = 0; i < members.length; i++) {
			if(members[i] != null) {
				System.out.println(members[i]);
			} else {
				System.out.println("회원정보 없음");
			}
		}
	}

	@Override
	public void login() { //getter
		
	}

	@Override
	public Member[] list() {
		return members;
	}

}
