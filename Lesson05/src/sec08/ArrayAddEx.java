package sec08;

public class ArrayAddEx {

	public static void main(String[] args) {


		String[] members = new String[2];
		String[] membersB = {"��ö��", "�迵��"};
		
		members[0] = "ö��";
		members[1] = "����";
		
		for(int i=0; i < 2; i++) {
			System.out.println("������ :" + members[i]);
			System.out.println("������ :" + membersB[i]);
		}
		
//		members[2] = "����";
//		members[3] = "�μ�";
//		
//		membersB[2] = "�����";
//		membersB[3] = "�ڹμ�";
//		
//		for(int i=0; i < 4; i++) {
//			System.out.println("������ :" + members[i]);
//			System.out.println("������ :" + membersB[i]);
//		}
		
	}

}
