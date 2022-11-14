package ch06;

public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Member member = new Ex14_Member();
		member.setUid("admin");
//		System.out.println(member.uid); // 해당문구가 오류뜨는이유-> class에서 private로 생성한걸 가져오려해서
		System.out.println(member.getUid());
		
		member = new Ex14_Member("admin","운영자","1234", 30);
		System.out.println(member.toString());
		
		
		Ex14_Member[] gymMembers = new Ex14_Member[10];
		for (int i =0; i<gymMembers.length; i++) {
			gymMembers[i] = new Ex14_Member("admin"+i,"운영자","1234",30+i);
			System.out.println(gymMembers[i].toString());
		}
		
		
				

	}

}
