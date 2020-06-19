package member;

public class MemberServiceImpl implements MemberService {
	private Member[] members; //field 값을 넣으면 고정됨
	private int count; //field 값을 넣으면 고정됨
	
	public MemberServiceImpl() {
		members = new Member[3];
		count = 0;
	}
	
	@Override //회원가입
	public void join(Member member) { //setter
		members[count] = member;
		count++;
	}

	@Override //회원목록
	public Member[] list() {
		return members;
	}

	@Override //로그인
	public String login(Member member) {
		String result = "FAIL";
		for(int i = 0; i < count; i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&&
				member.getPassword().equals(members[i].getPassword())) {
				result = "SUCCESS";
				break;
			}
		}
		return result;
	}

	@Override //중복 아이디 체크
	public String check(Member member) {
		String result = "사용 가능한 아이디입니다.";
		for(int i = 0; i < count; i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				result = "사용 불가능한 아이디입니다.";
				break;
			}
		}
		return result;
	}

	@Override //회원수
	public int num(Member member) {
		return count;
	}

	@Override //비밀번호 수정
	public void edit(Member member) {
		String result = "수정실패";
		for(int i = 0; i < count; i++) {
			if(members[i].getUserid().equals(member.getUserid())) {
				members[i].setPassword(member.getPassword());
				result = "수정성공";
				break;
			} 
		}
	}
	@Override// 탈퇴
	public String remove(Member member) {
		String result ="탈퇴 안됨";
		for(int i = 1; i < count; i++) {
			if(member.getUserid().equals(members[i].getUserid()) 
					&& member.getPassword().equals(members[i].getPassword())) {
				members[i] = members[count - 1]; //뒤에 있는걸 넣음 
				members[count - 1] = null; //뒤에 값 없앰
				count--; //뒤에 값 채워지기 위해 --
				result = "탈퇴 완료";
				break;
			}
		}
		return result;
	}

	@Override //id찾기
	public Member[] search(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override //이름 찾기
	public Member[] namefind(String name) {
		int cnt = 0;
		for(int i = 0; i < members.length; i++) {
			if(name.equals(members[i].getName())) {
				cnt++;
			}
		}
		Member[] smembers = new Member[cnt];
		int k = 0;
		for(int i = 0; i < members.length; i++) {
			if(name.equals(members[i].getName())) {
				smembers[k] = members[i];
				k++;
				if(k == cnt)break;
			}
		}
		return members;
	}
}
